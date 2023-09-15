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

    @FindBy(xpath = "//div[@id='start']")
    public WebElement startButton;

    @FindBy(css = "div#loading")
    public WebElement Loading;

    @FindBy(xpath = "//input[@type='username']")
    public WebElement inputUserName;



}
