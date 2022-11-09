package com.techproed.pages;

import com.techproed.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestAddressLoginPage {

    /*
    This is the page class
    This will have only page objects and main important methods
     */

    //Create constructor
    //we use constructor when we need to create object
    //PageFactory.initElements initialize this page objects
    public TestAddressLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    //Create page objects
    //we can locate using 8 locators
    @FindBy(id="session_email")
    public WebElement email;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement signInButton;



}
