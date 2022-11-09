package com.techproed.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG02_HardAssertion {
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
    public void hardAssert(){
        driver.get("https://www.carettahotel.com/");
        //using hard assertion
        Assert.assertEquals(driver.getTitle(),"Caretta Hotels - Home");

        driver.findElement(By.xpath("//a[@href='/Account/Logon']")).click();
        Assert.assertEquals(driver.getTitle(),"Caretta Hotels - Log in");



    }
}
