package com.academy.test.lesson23.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SortDresses extends BaseTest {
        private WebDriver driver;
        private String baseUrl;
        private boolean acceptNextAlert = true;
        private StringBuffer verificationErrors = new StringBuffer();

        @Test
        public void testUntitledTestCase() throws Exception {
            driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
            driver.findElement(By.id("email")).clear();
            driver.findElement(By.id("email")).sendKeys("wizik88@gmail.com");
            driver.findElement(By.id("passwd")).clear();
            driver.findElement(By.id("passwd")).sendKeys("Tomax1488");
            driver.findElement(By.linkText("Sign in")).click();
            driver.findElement(By.id("email")).clear();
            driver.findElement(By.id("email")).sendKeys("wizik88@gmail.com");
            driver.findElement(By.id("passwd")).clear();
            driver.findElement(By.id("passwd")).sendKeys("Tomax1488");
            driver.findElement(By.id("email")).click();
            driver.findElement(By.id("passwd")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Forgot your password?'])[1]/following::span[1]")).click();
            driver.findElement(By.linkText("Women")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='View'])[1]/following::i[2]")).click();
            driver.findElement(By.id("selectProductSort")).click();
            new Select(driver.findElement(By.id("selectProductSort"))).selectByVisibleText("Product Name: A to Z");
            driver.findElement(By.id("selectProductSort")).click();
            new Select(driver.findElement(By.id("selectProductSort"))).selectByVisibleText("Product Name: Z to A");
            new Select(driver.findElement(By.id("selectProductSort"))).selectByVisibleText("In stock");
            new Select(driver.findElement(By.id("selectProductSort"))).selectByVisibleText("Reference: Lowest first");
            new Select(driver.findElement(By.id("selectProductSort"))).selectByVisibleText("Reference: Highest first");
        }


            }



