package com.cydeo.tests.Day5_TestNG_Dropdowns;

import com.cydeo.utilities.WebDriver_Factory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium  {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        //do browser setUp
        //Open Browser
     driver = WebDriver_Factory.getDriver("Chrome");

        //maximize the page
        driver.manage().window().maximize();

        //ImplicitWait
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


    }

    @Test
    public void selenium_test(){

        //Get "https://google.com"
        driver.get("https://google.com");


        //Assert: title is "Google"
        Assert.assertEquals(driver.getTitle(),"Google");





    }

@AfterMethod
    public void tearDownMethod(){
        driver.close();
}


}


