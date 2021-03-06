package com.academy.test.lesson19;


import java.util.concurrent.TimeUnit;

import com.academy.lesson18.manager.PropertyManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import static org.testng.Assert.*;

import org.openqa.selenium.*;


public class Tests {
    private WebDriver driver;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    PropertyManager propertyManager = PropertyManager.getInstance();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        System.setProperty( "webdriver.chrome.driver" , propertyManager.getProperty( "chrome.driver" ) );
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait( 30 , TimeUnit.SECONDS );
    }

    @Test
    public void testSingTestCase() throws Exception {
        driver.get( "http://automationpractice.com/index.php" );
        driver.findElement( By.linkText( "Sign in" ) ).click();
        driver.findElement( By.id( "email" ) ).clear();
        driver.findElement( By.id( "email" ) ).sendKeys( "wizik88@gmail.com" );
        driver.findElement( By.id( "passwd" ) ).clear();
        driver.findElement( By.id( "passwd" ) ).sendKeys( "Tomax1488" );
        driver.findElement( By.id( "passwd" ) ).click();
        driver.findElement( By.id( "passwd" ) ).clear();
        driver.findElement( By.id( "passwd" ) ).sendKeys( "" );
        driver.findElement( By.xpath( "(.//*[normalize-space(text()) and normalize-space(.)='Forgot your password?'])[1]/following::span[1]" ) ).click();
        driver.findElement( By.id( "passwd" ) ).clear();
        driver.findElement( By.id( "passwd" ) ).sendKeys( "Tomax1488" );
        try {
            assertEquals( driver.findElement( By.xpath( "(.//*[normalize-space(text()) and normalize-space(.)='Authentication'])[2]/following::li[1]" ) ).getText() , "Password is required." );
        } catch (Error e) {
            verificationErrors.append( e.toString() );
        }
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals( verificationErrorString )) {
            fail( verificationErrorString );
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement( by );
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}
