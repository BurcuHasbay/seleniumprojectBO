package com.cydeo.tests.Day6_alerts_Iframes_windows;

import com.cydeo.utilities.WebDriver_Factory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_Iframes {

WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriver_Factory.getDriver("firefox");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        //3. Go to: https://practice.cydeo.com/iframe
    driver.get("https://practice.cydeo.com/iframe");
    }

    @Test
    public void test4_Iframe (){

        //YOU NEED TO SWITCH DRIVER'S FOCUS TO iframe
        //OPTION 1) Switching to iframe using id attribute value
        driver.switchTo().frame("mce_0_ifr");


        //OPTION 2 = passing index number of iframe
        // driver.switchTo().frame(0); -IF there is ONLY ONE -then you can use 0-cause it starts with 0.


        //OPTION 3= LOCATE as a WEB ELEMENT and pass in frame method.
       // driver.switchTo().frame(driver.findElement(By.xpath("")));

        //LOCATE FIRST THE P TAG
        WebElement yourContentGoesHere_Text = driver.findElement(By.xpath("//p"));


        //4. Assert: “Your content goes here.” Text is displayed.

        Assert.assertTrue(yourContentGoesHere_Text.isDisplayed());

        //Verify "An iFrame containing the TinyMCE WYSIWYG Editor" this is Displayed
        // To be able to verify the header, we must switch it back to 'main HTML'

        driver.switchTo().parentFrame();
        WebElement header_Text = driver.findElement(By.xpath("//h3"));

        Assert.assertTrue(header_Text.isDisplayed());


    }



 //4. Assert: “Your content goes here.” Text is displayed.
//5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”

}
