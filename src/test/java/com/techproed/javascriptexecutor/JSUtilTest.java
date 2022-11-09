package com.techproed.javascriptexecutor;

import com.techproed.utilities.ConfigReader;
import com.techproed.utilities.Driver;
import com.techproed.utilities.JSUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JSUtilTest {

    @Test
    public void scrollIntoView(){
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));

        WebElement cokSatanlar = Driver.getDriver().findElement(By.xpath("//h2[@class='as-title-block-left'][1]']"));
        JSUtils.scrollIntoView(cokSatanlar);

    }



}
