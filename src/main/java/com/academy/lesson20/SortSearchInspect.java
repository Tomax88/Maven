package com.academy.lesson20;

import com.academy.lesson18.manager.PropertyManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import static org.testng.Assert.assertEquals;

public class SortSearchInspect {
    private WebDriver driver;
    //  private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    PropertyManager propertyManager = PropertyManager.getInstance();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", propertyManager.getProperty("chrome.driver"));
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    @Test
    public void searchCottonDressTests(){
        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"layered_id_attribute_group_1\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ul_layered_id_feature_5\"]/li[1]/label/a")).click();
        try {
            assertEquals(driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")).getText(), "Printed Dress");
            assertEquals(driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[1]/span")).getText(),"$26.00");
            assertEquals(driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[4]/div/div[2]")).getText(),"Showing 1 - 1 of 1 items");
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
    }
    @Test
    public void inspectElementTests(){
        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a")).click();
        try {
            assertEquals(driver.findElement(By.xpath("//title")).getText(),"Women");
            assertEquals(driver.findElement(By.id("block_top_menu")).getText(),"women");
            assertEquals(driver.findElement(By.xpath("//*[@id=\"categories_block_left\"]/h2")).getText(),"Women");
            assertEquals(driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/div/div/span")).getText(),"Women");
            assertEquals(driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1/span[1]")).getText(),"Women");
            assertEquals(driver.findElement(By.xpath("//*[@id=\"footer\"]/div/section[2]/div/div/ul/li/a")).getText(),"You will find here all woman fashion");
            assertEquals(driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[4]/div/div[2]")).getText(),"Showing");
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }


    }





    @Test
    public void sortDressByLowestPriceTest() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.cssSelector("#block_top_menu > ul > li:nth-child(2) > a")).click();
        new Select(driver.findElement(By.id("selectProductSort"))).selectByVisibleText("Price: Lowest first");
        driver.findElement(By.xpath("//*[@id=\"list\"]/a/i")).click();

        // ждем пока прогрузится
        waitUntilScriptComplete(driver);

        List<WebElement> actualPrices = driver.findElements(By.cssSelector("#center_column > ul > li > div > div > div.right-block.col-xs-4.col-xs-12.col-md-4 > div > div.content_price.col-xs-5.col-md-12 > span.price.product-price"));
        List<String> actualPrises1 = new ArrayList<String>();
        for(WebElement e : actualPrices){
            actualPrises1.add(e.getText());
        }
        List<String> expectedPrices = new ArrayList<>(actualPrises1);
        expectedPrices.sort(String::compareTo);

        System.out.println(actualPrises1);
        System.out.println(expectedPrices);
        Assert.assertEquals(actualPrises1, expectedPrices);


//        List<String> actualPrices =
//                driver.findElements(By.cssSelector("#center_column > ul > li > div > div > div.right-block.col-xs-4.col-xs-12.col-md-4 > div > div.content_price.col-xs-5.col-md-12 > span.price.product-price"))
//                        //#center_column > ul > li > div > div > div.right-block.col-xs-4.col-xs-12.col-md-4 > div > div.content_price.col-xs-5.col-md-12 > span.price.product-price
//                        .stream()
//                        .map(WebElement::getText)
//                        .peek(String::trim)
//                        .collect(Collectors.toList());
//
//        List<String> expectedPrices = new ArrayList<>(actualPrices);
//        expectedPrices.sort(String::compareTo);
//        System.out.println("actual: " + actualPrices);
//        System.out.println("expected: " + expectedPrices);
//        Assert.assertEquals(actualPrices, expectedPrices);

        driver.quit();

        // можно делать проверки
//        try {
//            assertEquals(driver.findElement(By.xpath("//div[@class='product-count']")).getText(), "Showing 1 - 5 of 5 items");
//        } catch (Error e) {
//            verificationErrors.append(e.toString());
//        }

    }






    private boolean waitUntilScriptComplete(WebDriver driver1) {
        WebDriverWait wait = new WebDriverWait(driver1, 30, 300);

        // wait for jQuery to load
        ExpectedCondition<Boolean> jQueryLoad = driver -> {
            try {
                return ((Long)((JavascriptExecutor)driver).executeScript("return jQuery.active") == 0);
            }
            catch (Exception e) {
                // no jQuery present
                return true;
            }
        };

        // wait for Javascript to load
        ExpectedCondition<Boolean> jsLoad = driver -> ((JavascriptExecutor)driver).executeScript("return document.readyState")
                .toString().equals("complete");

        return wait.until(jQueryLoad) && wait.until(jsLoad);
    }


}
