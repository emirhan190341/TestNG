package com.techproed.tests;

import com.techproed.utilities.ConfigReader;
import com.techproed.utilities.Driver;
import org.junit.Assert;
import org.testng.annotations.Test;

public class FirstConfigTest {

    @Test
    public void firstConfigTest(){
        //go to app_url
        //Driver.getDriver().get("https://www.amazon.com.tr/ref=nav_logo");
        //ConfigReader.getProperty("app_url") >>>> https://www.amazon.com.tr/ref=nav_logo
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        //Assert.assertEquals(Driver.getDriver().getTitle(),(ConfigReader.getProperty("app_title")));

    }
}
