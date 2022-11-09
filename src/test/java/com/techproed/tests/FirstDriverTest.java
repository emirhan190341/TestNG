package com.techproed.tests;

import com.techproed.utilities.Driver;
import org.junit.Assert;
import org.testng.annotations.Test;

public class FirstDriverTest {

    @Test
    public void amazonTitleTest(){
        Driver.getDriver().get("https://www.amazon.com.tr/ref=nav_logo");

        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains("Amazon"));
    }
}
