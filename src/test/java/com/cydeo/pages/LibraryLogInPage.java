package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLogInPage {

    //#1 Initialize the driver instance and the object of the class
    public LibraryLogInPage(){
        //İnitElements method will create connection in between the current driver session (instance)
        // and the object of the current class.
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //#2 use @FindBy annotation to locate web elements
    //Normally we would do this, WebElement .... = Driver.getDriver....

    @FindBy(xpath = "//input[@id='inputEmail']")
    public WebElement inputUserName;

    @FindBy(id = "inputPassword")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement signInButton;

    @FindBy(xpath = "//div[.='This field is required.']/div")
    public WebElement fieldRequiredErrorMessage;

    @FindBy(xpath = "//div[.='Please enter a valid email address.']/div")
    public WebElement enterValidEmailErrorMessage;

    @FindBy(xpath = "//div[.='Sorry, Wrong Email or Password']")
    public WebElement wrongEmailOrPasswordErrorMessage;


        //1- Open a chrome browser
        //2- Go to: https://library1.cydeo.com








}
/*
#1: Required field error message test

//3- Do not enter any information
//4- Click to “Sign in” button
//5- Verify expected error is displayed:
//Expected: This field is required. NOTE: FOLLOW POM DESIGN PATTERN
 */