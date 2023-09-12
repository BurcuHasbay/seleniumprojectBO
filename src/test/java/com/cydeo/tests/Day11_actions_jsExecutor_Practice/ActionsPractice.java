package com.cydeo.tests.Day11_actions_jsExecutor_Practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsPractice {

    @Test
    public void task4_and_5_test(){

       // 1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/
        Driver.getDriver().get("https://practice.cydeo.com/");


        //3- Scroll down to “Powered by CYDEO”
        //Create object of Actions and pass our "driver" instance
        Actions actions = new Actions(Driver.getDriver());

        //Locating cydeo link to be able to pass in the actions method
        // OR >>>    a[@href='https://cydeo.com/']
       WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));

        actions.moveToElement(cydeoLink).pause(4000).perform();



        //4- Scroll using Actions class “moveTo(element)” method
    }
}
