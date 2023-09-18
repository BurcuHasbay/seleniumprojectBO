package com.cydeo.tests.Day13_review_and_practice;

import com.cydeo.pages.DynamicControlPage;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExplicitWay_Practices {

    DynamicControlPage dynamicControlPage;

    @BeforeMethod
    public void setUp(){

        Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls");
        dynamicControlPage = new DynamicControlPage();
    }

    @Test
    public void remove_button_test1(){

        //3- Click to “Remove” button
        dynamicControlPage.removeButton.click();


        //4- Wait until “loading bar disappears”
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(dynamicControlPage.loadingBAR));

        //5- Verify:
        //a- Checkbox is not displayed// ACTUALLY IT IS DELETED THAT'S WHY TEST FAILS ALL THE TIME
        // ''TRY''
        try{
            Assert.assertFalse(dynamicControlPage.checkBoxButton.isDisplayed());

        }catch (NoSuchElementException n){
            Assert.fail();
        }





    }

}


/*
#2: Explicit wait practice
//1- Open a chrome browser
//2- Go to: https://practice.cydeo.com/dynamic_controls




//NOTE: FOLLOW POM

 */


/*
#3: Explicit wait practice
//1- Open a chrome browser
//2- Go to: https://practice.cydeo.com/dynamic_controls
//3- Click to “Enable” button
//4- Wait until “loading bar disappears”
//5- Verify:
//a- Input box is enabled.
//b- “It’s enabled!” message is displayed.
//NOTE: FOLLOW POM
 */