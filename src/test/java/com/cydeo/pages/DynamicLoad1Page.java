package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoad1Page {


    //Creating Constructor First
    public DynamicLoad1Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css="button.btn")
    public WebElement startButton;

    @FindBy(css = "div#loading")
    public WebElement LoadingBar;

    @FindBy(xpath = "//input[@type='username']")
    public WebElement inputUserName;

    @FindBy(xpath = "//input[@type='password']")
    public  WebElement inputPassword;

    @FindBy(xpath ="//button[@type='submit']")
    public  WebElement submitButton;

    @FindBy(id = "flash")
    public  WebElement errorMessage;


}
