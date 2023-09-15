package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicControlPage {

    public DynamicControlPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@type='checkbox']")
    public WebElement checkBoxButton;

    @FindBy(xpath = "//button[.='Remove']")
    public WebElement removeButton;

    @FindBy(id = "loading")
    public WebElement loadingBAR;

    @FindBy(xpath = "//p[@id='message']")
    public WebElement itSGoneMessage;

}
