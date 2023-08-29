package com.cydeo.tests.Day8_properties_config_reader;

import com.cydeo.utilities.WebDriver_Factory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_Config_Practice {

    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){

        driver = WebDriver_Factory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://google.com");

    }

    @Test
    public void googleSearch_Test(){

        //3- Write “apple” in search box 4- Verify title:
//Expected: apple - Google Search

        WebElement googleSearchBox = driver.findElement(By.xpath("//textarea[@name ='q']"));

        googleSearchBox.sendKeys("apple"+ Keys.ENTER);

        String expectedTitle = "apple - Google Search";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);

    }




    /*
    TC #4: Google search
1- Open a chrome browser
2- Go to: https://google.com



Use `configuration.properties` for the following:

1. The browser type
2. The URL
3. The search keyword
4. Make title verification dynamic. If search value changes, title assertion should not fail.
     */
}
