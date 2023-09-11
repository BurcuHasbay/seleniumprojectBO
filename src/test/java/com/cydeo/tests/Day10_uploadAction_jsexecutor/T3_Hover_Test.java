package com.cydeo.tests.Day10_uploadAction_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T3_Hover_Test {

  //  1. Go to https://practice.cydeo.com/hovers
    @Test
    public void hover_Test(){

        Driver.getDriver().get("https://practice.cydeo.com/hovers");

        //Locate all images under here:
        WebElement img1 = Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement img2 = Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        WebElement img3 = Driver.getDriver().findElement(By.xpath("(//img)[3]"));

        //Locate all the users here:
        WebElement user1 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user1']"));
        WebElement user2 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user2']"));
        WebElement user3 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user3']"));


        //2. Hover over to first image
        Actions actions = new Actions(Driver.getDriver());
        BrowserUtils.sleep(2000);
        actions.moveToElement(img1).perform();

        //3. Assert:
        //a- “name: user1” is displayed
        Assert.assertTrue(user1.isDisplayed());









    }



    //4. Hover over to second image
    //5. Assert:
    //a. “name: user2” is displayed

    //6. Hover over to third image
    //7. Confirm:
    //a. “name: user3” is displayed





}
