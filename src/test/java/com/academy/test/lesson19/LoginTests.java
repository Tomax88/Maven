package com.academy.test.lesson19;

import java.awt.image.RenderedImage;
import java.util.concurrent.TimeUnit;

import com.academy.lesson18.manager.PropertyManager;
import com.academy.test.BaseTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import static org.testng.Assert.*;

import org.openqa.selenium.*;


public class LoginTests extends BaseTest {
//    private WebDriver driver;
    //  private String baseUrl;
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

@DataProvider(name = "authProvider")
private Object[][] authProvider(){
    return new Object[][]{{propertyManager.getProperty( "automation.username" ) , propertyManager.getProperty( "automation.password" )}};

}
}