package com.academy.test.lesson19;
import java.util.concurrent.TimeUnit;

import com.academy.lesson18.manager.PropertyManager;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IncorrectLoginTests {
    private WebDriver driver;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    PropertyManager propertyManager = PropertyManager.getInstance();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", propertyManager.getProperty("chrome.driver"));
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void incorrectLoginData() throws Exception {
        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("drdttd@jhas.ry");
        driver.findElement(By.id("passwd")).click();
        driver.findElement(By.id("passwd")).clear();
        driver.findElement(By.id("passwd")).sendKeys("werwerwewr");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Forgot your password?'])[1]/following::span[1]")).click();
        try {
            assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Authentication'])[2]/following::p[1]")).getText(), "There is 1 error");
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
    }
    @Test
    public void emptyPasswordField() throws Exception {
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("drdttd@jhas.ry");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Forgot your password?'])[1]/following::span[1]")).click();
        try {
            assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Authentication'])[2]/following::li[1]")).getText(), "Password is required.");
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
    }
    @Test
    public void incorrectPassword() throws Exception {
        driver.get("http://automationpractice.com/index.php?controller=authentication");
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("dimabologov@gmail.com");
        driver.findElement(By.id("passwd")).click();
        driver.findElement(By.id("passwd")).clear();
        driver.findElement(By.id("passwd")).sendKeys("qwerty");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Forgot your password?'])[1]/following::span[1]")).click();
        try {
            assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Authentication'])[2]/following::li[1]")).getText(), "Authentication failed.");
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
    }
    @Test
    public void incorrectEmail() throws Exception {
        driver.get("http://automationpractice.com/index.php?controller=authentication");
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("asdsdasda");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Forgot your password?'])[1]/following::span[1]")).click();
        try {
            assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Authentication'])[2]/following::p[1]")).getText(), "There is 1 error");
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
    }
    @Test
    public void emptyAllFields() throws Exception {
        driver.get("http://automationpractice.com/index.php?controller=authentication");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("");
        driver.findElement(By.id("passwd")).click();
        driver.findElement(By.id("passwd")).clear();
        driver.findElement(By.id("passwd")).sendKeys("");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Forgot your password?'])[1]/following::span[1]")).click();
        try {
            assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Authentication'])[2]/following::li[1]")).getText(), "An email address required.");
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
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

