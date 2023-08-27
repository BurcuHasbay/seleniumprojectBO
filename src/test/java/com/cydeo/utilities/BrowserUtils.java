package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {

    /*
    In this class, only general utility methods that are not related to some specific page
     */
    public static void sleep(int second){
        second*=2000;
        try{
            Thread.sleep(second);
        }catch (InterruptedException e){

        }
    }



/*
This method below accepts 3 arguments:
Arg 1- webdriver
Arg 2- expectedInUrl: to verify if the url contains given String
Arg 3- expectedTitle to be compared to actualTitle
 */
    public static void switchWindAndVerify(WebDriver driver, String expectedInURL, String expectedTitle){
        Set<String> allWindowHandles = driver.getWindowHandles();

        for (String each : allWindowHandles) {

            driver.switchTo().window(each);
            System.out.println("Current URL: " + driver.getCurrentUrl());

            if (driver.getCurrentUrl().contains(expectedInURL)){
                break;
            }

        }

        String actualTitle = driver.getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }





    /*
    This method below accepts String "expectedTitle" and Asserts if it is true

    */
    public static void verifyTitle(WebDriver driver, String expectedTitle){
        Assert.assertEquals(driver.getTitle(), expectedTitle);
    }


}
