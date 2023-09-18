package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicControlPage {

    public DynamicControlPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "input[type='checkbox']")
    public WebElement checkBoxButton;

    //xpath = "//button[.='Remove']"
    @FindBy(css = "form#checkbox-example > button")
    public WebElement removeButton;

    @FindBy(css = "div#loading")
    public WebElement loadingBAR;

    @FindBy(xpath = "//p[@id='message']")
    public WebElement itSGoneMessage;

}
