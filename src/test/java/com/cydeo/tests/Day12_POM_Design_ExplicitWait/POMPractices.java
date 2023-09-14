package com.cydeo.tests.Day12_POM_Design_ExplicitWait;

import com.cydeo.pages.LibraryLogInPage;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POMPractices {

    @BeforeMethod
    public void setUp(){
        Driver.getDriver().get("https://library1.cydeo.com");

    }

    @Test
    public void task2_required_field_ErrorMessage(){

        //1- Open a chrome browser
        //2- Go to: https://library1.cydeo.com

        //3- Do not enter any information
        //4- Click to “Sign in” button
        //First Create an Object of the class
        LibraryLogInPage libraryLogInPage = new LibraryLogInPage();

        //Reaching the web elements existing in the class
        libraryLogInPage.signInButton.click();



        //5- Verify expected error is displayed:
        //Expected: This field is required. NOTE: FOLLOW POM DESIGN PATTERN

        Assert.assertTrue(libraryLogInPage.fieldRequiredErrorMessage.isDisplayed());



    }

    @Test
    public void  Task2_InvalidEmailFormat_errorMessage(){

        LibraryLogInPage libraryLogInPage = new LibraryLogInPage();

    //3- Enter invalid email format
        libraryLogInPage.inputUserName.sendKeys("asdfdfdfd");

        //4- Verify expected error is displayed:
        Assert.assertTrue(libraryLogInPage.enterValidEmailErrorMessage.isDisplayed());

        //Expected: Please enter a valid email address.

    }


    @Test
    public void invalidUsername_or_invalidPassword(){
        LibraryLogInPage libraryLogInPage = new LibraryLogInPage();

        //3- Enter incorrect username or incorrect password
        libraryLogInPage.inputUserName.sendKeys("asdf@asdf");
        libraryLogInPage.inputPassword.sendKeys("sfhdhhfhdh");
        libraryLogInPage.signInButton.click();




    }


}



/*
#3: Library negative login
1- Open a chrome browser
2- Go to: https://library1.cydeo.com

//4- Verify title expected error is displayed:
Expected: Sorry, Wrong Email or Password NOTE: FOLLOW POM DESIGN PATTERN
 */