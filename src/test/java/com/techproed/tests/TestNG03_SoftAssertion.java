package com.techproed.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class TestNG03_SoftAssertion {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }

    @Test
    public void softAssert(){
        driver.get("https://www.carettahotel.com/");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(driver.getTitle().equals("Caretta Hotel"));

        //use assertAll() to make the acutal assertion
        //if you dont use assertAll, you get false test result
        softAssert.assertAll();
    }

}
