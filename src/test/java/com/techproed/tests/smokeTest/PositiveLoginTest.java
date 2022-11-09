package com.techproed.tests.smokeTest;

import com.techproed.pages.DefaultPage;
import com.techproed.pages.LoginPage;
import com.techproed.pages.MainPage;
import com.techproed.utilities.ConfigReader;
import com.techproed.utilities.Driver;
import org.junit.Assert;
import org.testng.annotations.Test;



public class PositiveLoginTest {

    @Test
    public void positiveLoginTest(){
        Driver.getDriver().get(ConfigReader.getProperty("test_address_url"));

        MainPage mainPage = new MainPage();
        mainPage.mainPageLoginLink.click();

        //At this point we are at the login page
        //Create loginpage object
        LoginPage loginPage = new LoginPage();
        loginPage.email.sendKeys(ConfigReader.getProperty("test_address_email"));
        loginPage.password.sendKeys(ConfigReader.getProperty("test_address_password"));
        loginPage.loginButton.click();

        DefaultPage defaultPage = new DefaultPage();
        boolean isLoggedIn = defaultPage.signOutButton.isDisplayed();
        Assert.assertTrue(isLoggedIn);

    }






}
