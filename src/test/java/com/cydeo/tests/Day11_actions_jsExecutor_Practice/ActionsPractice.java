package com.cydeo.tests.Day11_actions_jsExecutor_Practice;

import com.cydeo.utilities.Driver;
import org.testng.annotations.Test;

public class ActionsPractice {

    @Test
    public void task4_and_5_test(){

       // 1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/
        Driver.getDriver().get("https://practice.cydeo.com/");


        //3- Scroll down to “Powered by CYDEO”


        //4- Scroll using Actions class “moveTo(element)” method
    }
}
