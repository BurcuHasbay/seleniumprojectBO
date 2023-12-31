package com.cydeo.tests.Day12_POM_Design_ExplicitWait;

import com.cydeo.pages.DynamicLoad1Page;
import com.cydeo.pages.DynamicLoad7Page;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class WebDriverWait_Practices {


    @Test
    public void dynamic_load_7_Test(){
    //1. Go to https://practice.cydeo.com/dynamic_loading/7

        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/7");

        //2. Wait until title is “Dynamic title”
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        //3.use the "wait" object  to be able to create certain condition to wait
        wait.until(ExpectedConditions.titleIs("Dynamic title"));

        //BEFORE ASSERTING- CREATE!!!! OBJECT OF 'DynamicLOAD7PAGE' TO REACH AND ASSERT WEB ELEMENTS

        DynamicLoad7Page dynamicLoad7Page = new DynamicLoad7Page();

        //4. Assert: Message “Done” is displayed.
        Assert.assertTrue(dynamicLoad7Page.doneMessage.isDisplayed());

        //5. Assert: Image is displayed.

        Assert.assertTrue(dynamicLoad7Page.spongeBobImage.isDisplayed());


    }



    @Test
    public void dynamically_load_1_Test(){

        //#5 : Dynamically Loaded Page Elements 1
        //1. Go to https://practice.cydeo.com/dynamic_loading/1
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/1");


        //BEFORE ASSERTING- CREATE!!!! OBJECT OF 'DynamicLOAD7PAGE' TO REACH AND ASSERT WEB ELEMENTS
        DynamicLoad1Page dynamicLoad1Page = new DynamicLoad1Page();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(15));

        //3. Click to start
                dynamicLoad1Page.startButton.click();

        //2. Wait until loading bar disappears. BUT FIRST CREATE a constructor OF WEB DRIVER WAIT

        wait.until(ExpectedConditions.invisibilityOf(dynamicLoad1Page.LoadingBar));

        //4. Assert username inputbox is displayed
        Assert.assertTrue(dynamicLoad1Page.inputUserName.isDisplayed());


        //5. Enter username: to msmith
        dynamicLoad1Page.inputUserName.sendKeys("tomsmith");

        //6. Enter password: incorrect password
        dynamicLoad1Page.inputPassword.sendKeys("incorrectpassword");

        //7. Click to Submit button
        dynamicLoad1Page.submitButton.click();




    }

}

/*









//Note: Follow POM Design Pattern
 */




