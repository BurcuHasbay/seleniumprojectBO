package com.cydeo.tests.Day5_TestNG_Dropdowns;

import com.cydeo.utilities.WebDriver_Factory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_SimpleDropDowns {

WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
//1. Open Chrome browser
//2. Go to https://practice.cydeo.com/dropdown
        driver = WebDriver_Factory.getDriver("firefox");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");

    }

    @Test
    public void simpleDropDown_test(){
        //TC#4: Verifying “Simple dropdown” and “State selection” dropdown default values

//3. Verify “Simple dropdown” default selected value is correct
        Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));



//Expected: “Please select an option”
        WebElement currentSelectedOption = simpleDropdown.getFirstSelectedOption();

        String actualSimpleDropdown_Text = currentSelectedOption.getText();
        String expectedSimpleDropDown_Text = "Please select an option";

        Assert.assertEquals(actualSimpleDropdown_Text,expectedSimpleDropDown_Text);



//4. Verify “State selection” default selected value is correct

        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        WebElement SelectedOptionNow = stateDropdown.getFirstSelectedOption();


        //Different way
      //  String actualStateDropdown_Text = stateDropdown.getFirstSelectedOption().getText();

        String  actualStateDropdown_Text = SelectedOptionNow.getText();
        String expectedStateDropdown_Text = "Select a State";

        Assert.assertEquals(actualStateDropdown_Text,expectedStateDropdown_Text);

        //Different way
        //>> Assert.assertEquals(stateDrop.getFirstSelectedOption().getText(), expected: “Select a state”);
        //

//Expected: “Select a State”

    }



}
