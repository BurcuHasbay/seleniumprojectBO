package com.cydeo.tests.Day5_TestNG_Dropdowns;

import com.cydeo.utilities.WebDriver_Factory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T2_RadioButton {
    public static void main(String[] args) throws InterruptedException {



//Open Chrome
        WebDriver driver = WebDriver_Factory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



//2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");

//3. Click to “Hockey” radio button
        WebElement hokeyButton = driver.findElement(By.xpath("//input[@id = 'hockey']"));

        Thread.sleep(2000);
        hokeyButton.click();

//4. Verify “Hockey” radio button is selected after clicking.
        System.out.println("hokeyButton.isSelected() = " + hokeyButton.isSelected());

//USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS




    }
}
