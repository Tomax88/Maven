package com.academy.test.lesson23.test;

import com.academy.lesson18.manager.PropertyManager;
import com.academy.test.lesson23.page.AccountPage;
import com.academy.test.lesson23.page.HomePage;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class LoginTests extends BaseTest {

//  private PropertyManager propertyManager = PropertyManager.getInstance();

    @Test(dataProvider = "authProvider", enabled = false)
    public void testAuthCorrect(String email, String password) throws Exception {
        System.out.println("Start LoginTest using PageObject pattern");
        // 1 Способ - не круто
//    HomePage homePage = new HomePage(driver);
//    LoginPage loginPage = homePage.clickSingIn();
//    loginPage.inputEmail(email);
//    loginPage.inputPassword(password);
//    AccountPage accountPage = loginPage.clickSingIn();

        // 2 Способ - пока круто
        AccountPage accountPage =
                new HomePage(driver)
                        .clickSingIn()
                        .inputEmail(email)
                        .inputPassword(password)
                        .clickSingIn();

        String userNameLinkText = accountPage.getUserNameLinkText();
        assertEquals(userNameLinkText, "Александр Томах");
        accountPage.clickSignOut();
    }

    @Test(dataProvider = "incorrectLoginProvider")
    public void testAuthIncorrect(String email, String password, String errorMsg) {
        System.out.println(String.format("email: %s, password:%s, errorMsg:%s", email, password, errorMsg));
    }

  @DataProvider(name="authProvider")
    private Object[][] authProvider() {
        return new Object[][]{
                {PropertyManager.getInstance().getProperty("automation.username"), PropertyManager.getInstance().getProperty("automation.password")}
        };
    }

    @DataProvider(name = "incorrectLoginProvider")
    public Object[][] provideIncorrectAuthData() {
        String authDataPath = PropertyManager.getInstance().getProperty("auth.incorrect.data");

        try (XSSFWorkbook workbook = new XSSFWorkbook(authDataPath)) {
            XSSFSheet sheet = workbook.getSheetAt(0);

            Object[][] data = new Object[sheet.getLastRowNum()][3];

            for (int r = 1; r <= sheet.getLastRowNum(); r++) {
                XSSFRow row = sheet.getRow(r);
                String email = row.getCell(0).getStringCellValue();
                String password = row.getCell(1).getStringCellValue();
                String errMsg = row.getCell(2).getStringCellValue();

                data[r-1][0] = email;
                data[r-1][1] = password;
                data[r-1][2] = errMsg;
            }

            return data;

//    return new Object[][]{
//            {"qwer@qwe.qwe","123qwe","Authentication failed."},
//            {"qwer@qwe.qwe","Tnm601982","Authentication failed."},
//            {"yavoric@rambler.ru","123qwe","Authentication failed."},
//            {"","","An email address required."},
//            {"yavoric@rambler.ru","","Password is required."},
//            {"","Tnm601982","An email address required."},
//            {"qwerty","","Invalid email address."}
//    };
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    PropertyManager propertyManager = PropertyManager.getInstance();



    @Test(dataProvider ="authProvider" )
    public void testUntitledTestCase(String username, String password) throws Exception {
        driver.get( "http://automationpractice.com/index.php" );
        driver.findElement( By.linkText( "Sign in" ) ).click();
        driver.findElement( By.xpath( "(.//*[normalize-space(text()) and normalize-space(.)='Already registered?'])[1]/following::div[2]" ) ).click();
        driver.findElement( By.id( "email" ) ).click();
        driver.findElement( By.id( "email" ) ).clear();
        driver.findElement( By.id( "email" ) ).sendKeys( username );
        driver.findElement( By.id( "passwd" ) ).click();
        driver.findElement( By.id( "passwd" ) ).clear();
        driver.findElement( By.id( "passwd" ) ).sendKeys( password );
        driver.findElement( By.xpath( "(.//*[normalize-space(text()) and normalize-space(.)='Forgot your password?'])[1]/following::span[1]" ) ).click();
        try {
            assertEquals( driver.findElement( By.xpath( "(.//*[normalize-space(text()) and normalize-space(.)='Sign out'])[1]/preceding::span[1]" ) ).getText() , "Александр Томах" );
        } catch (Error e) {
            verificationErrors.append( e.toString() );
        }
        driver.findElement( By.linkText( "Sign out" ) ).click();
    }
}

