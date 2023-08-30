package com.cydeo.tests.Day7_Webtables_Utilities_Javafaker;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import com.cydeo.utilities.WebDriver_Factory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T3_CRM_LOGIN {

    WebDriver driver;



    @Test
    public void crm_login_TEST() {
        driver.get("http://login1.nextbasecrm.com/");

        //Calling my utility method to log in helpdesk1
        CRM_Utilities.crm_LogIn(driver, "helpdesk2@cybertekschool.com", "UserUser");

        //6. Verify title is as expected:
        //Expected:Authorization
        //Because the given password is wrong


        BrowserUtils.verifyTitle(driver, "Authorization");


    }


    @Test
    public void crm_login_TEST2() {
        driver.get("http://login1.nextbasecrm.com/");

        //Calling my utility method to log in helpdesk1



        //6. Verify title is as expected:
        //Expected:Authorization

        BrowserUtils.verifyTitle(driver, "Authorization");


    }
}






//USERNAME: helpdesk1@cybertekschool.com --- Helpdesk2@cybertekschool.com
//PASSWORD: UserUser --- UserUser
