package com.techproed.tests;

import com.techproed.pages.TestAddressLoginPage;
import com.techproed.utilities.ConfigReader;
import com.techproed.utilities.Driver;
import org.testng.annotations.Test;

public class TestAddressLoginTest {

    @Test
    public void testAddressLogin(){
        //going to the application page
        //Driver.getDriver().get("http://a.testaddressbook.com/sign_in");
        Driver.getDriver().get(ConfigReader.getProperty("test_address_url"));

        //creating page object
        TestAddressLoginPage testAddressLoginPage = new TestAddressLoginPage();
        //sign in
        //testAddressLoginPage.email.sendKeys("testtechproed@gmail.com");
        testAddressLoginPage.email.sendKeys(ConfigReader.getProperty("test_address_email"));
        //testAddressLoginPage.password.sendKeys("Test1234!");
        testAddressLoginPage.password.sendKeys(ConfigReader.getProperty("test_address_password"));
        testAddressLoginPage.signInButton.click();
        Driver.closeDriver();
    }
}
