package com.techproed.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JSUtils {
    public static void scrollIntoView(WebElement element){
        JavascriptExecutor je = (JavascriptExecutor) Driver.getDriver();
        je.executeScript("arguments[0].scrollIntoView(true);", element);
    }
}
