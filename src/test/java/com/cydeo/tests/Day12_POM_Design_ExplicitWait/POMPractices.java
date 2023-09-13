package com.cydeo.tests.Day12_POM_Design_ExplicitWait;

import com.cydeo.utilities.Driver;
import org.testng.annotations.Test;

public class POMPractices {

    @Test
    public void task2_required_field_ErrorMessage(){

        //1- Open a chrome browser
        //2- Go to: https://library1.cydeo.com
        Driver.getDriver().get("https://library1.cydeo.com ");




    }


}
/*
#1: Required field error message test

//3- Do not enter any information
//4- Click to “Sign in” button
//5- Verify expected error is displayed:
Expected: This field is required. NOTE: FOLLOW POM DESIGN PATTERN
 */