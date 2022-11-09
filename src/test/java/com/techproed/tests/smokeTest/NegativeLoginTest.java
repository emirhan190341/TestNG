package com.techproed.tests.smokeTest;

import com.techproed.pages.LoginPage;
import com.techproed.utilities.ConfigReader;
import com.techproed.utilities.Driver;
import org.testng.annotations.Test;

public class NegativeLoginTest {

    @Test
    public void invalidPassword() {
        Driver.getDriver().get(ConfigReader.getProperty("test_address_url_login"));
        LoginPage loginPage = new LoginPage();
        loginPage.email.sendKeys();
    }

}
