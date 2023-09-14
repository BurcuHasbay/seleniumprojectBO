package com.cydeo.tests.Day12_POM_Design_ExplicitWait;

import com.cydeo.pages.LibraryLogInPage;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POMPractices {

    LibraryLogInPage libraryLogInPage;
    @BeforeMethod
    public void setUp(){
        Driver.getDriver().get("https://library1.cydeo.com");
        LibraryLogInPage libraryLogInPage = new LibraryLogInPage();
    }

    @Test
    public void task2_required_field_ErrorMessage(){

        //1- Open a chrome browser
        //2- Go to: https://library1.cydeo.com

        //3- Do not enter any information
        //4- Click to “Sign in” button
        //First Create an Object of the class


        //Reaching the web elements existing in the class
        libraryLogInPage.signInButton.click();



        //5- Verify expected error is displayed:
        //Expected: This field is required. NOTE: FOLLOW POM DESIGN PATTERN

        Assert.assertTrue(libraryLogInPage.fieldRequiredErrorMessage.isDisplayed());

        Driver.closeDriver();


    }

    @Test
    public void  Task2_InvalidEmailFormat_errorMessage(){


    //3- Enter invalid email format
        libraryLogInPage.inputUserName.sendKeys("somethingWrong");
        libraryLogInPage.signInButton.click();

        //libraryLogInPage.inputUserName.sendKeys("asdfdfdfd");



        //4- Verify expected error is displayed:
        Assert.assertTrue(libraryLogInPage.enterValidEmailErrorMessage.isDisplayed());

        //Expected: Please enter a valid email address.
        Driver.closeDriver();

    }


    @Test
    public void Task3_invalidUsername_or_invalidPassword(){


        //3- Enter incorrect username or incorrect password
        libraryLogInPage.inputUserName.sendKeys("asdf@asdf");
        libraryLogInPage.inputPassword.sendKeys("sfhdhhfhdh");
        libraryLogInPage.signInButton.click();

        //4- Verify title expected error is displayed:
        //Expected: Sorry, Wrong Email or Password NOTE: FOLLOW POM DESIGN PATTERN

        Assert.assertTrue(libraryLogInPage.wrongEmailOrPasswordErrorMessage.isDisplayed());
        Driver.closeDriver();

    }

    @Test
    public void Task4_library_negative_SignIn(){

        //3- Enter incorrect username or incorrect password

            libraryLogInPage.inputUserName.sendKeys("wrong@username.com");
            libraryLogInPage.inputPassword.sendKeys("döfnödfgönfgö");

            //Push SıgnIN Button
            libraryLogInPage.signInButton.click();

            //4- Verify title expected error is displayed:
                Assert.assertTrue(libraryLogInPage.wrongEmailOrPasswordErrorMessage.isDisplayed());

            //Expected: Sorry, Wrong Email or Password NOTE: FOLLOW POM DESIGN PATTERN




    }



}

/*
Library negative login
//1- Open a chrome browser
//2- Go to: https://library1.cydeo.com




#3: Library negative login
1- Open a chrome browser
2- Go to: https://library1.cydeo.com


 */