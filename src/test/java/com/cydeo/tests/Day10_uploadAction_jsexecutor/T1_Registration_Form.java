package com.cydeo.tests.Day10_uploadAction_jsexecutor;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.testng.annotations.Test;

public class T1_Registration_Form {


    @Test
    public void test1_registration(){

        //TC#1: Registration form confirmation
//Note: Use JavaFaker OR read from configuration.properties file when possible.
//1. Open browser
//2. Go to website:https://practice.cydeo.com/registration_form
       // Driver.getDriver().get("https://practice.cydeo.com/registration_form"); This is OK But now we want to use
        //configuration properties as possible.

        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));





    }
}




//3. Enter first name
//4. Enter last name
//5. Enter username
//6. Enter email address
//7. Enter password
//8. Enter phone number
//9. Select a gender from radio buttons
//10.Enter date of birth
//11.Select Department/Office
//12.Select Job Title
//13.Select programming language from checkboxes
//14.Click to sign up button
//15.Verify success message “You’ve successfully completed registration.” is displayed.
//Note:1. Use new Driver utility class and method
//2. User JavaFaker when possible
//3. User ConfigurationReader when it makes sense
