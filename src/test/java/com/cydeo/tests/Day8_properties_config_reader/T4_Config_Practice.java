package com.cydeo.tests.Day8_properties_config_reader;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class  T4_Config_Practice {


    @Test
    public void googleSearch_Tes(){
        Driver.getDriver().get("https://google.com");

    //Write "apple" on the search box
        WebElement googleSearchBox = Driver.getDriver().findElement(By.xpath("//textarea[@name='q']"));


    googleSearchBox.sendKeys(ConfigurationReader.getProperty(""));


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
