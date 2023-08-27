package com.cydeo.tests.Day5_TestNG_Dropdowns;

import com.cydeo.utilities.WebDriver_Factory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T1_StateElementRefT_Ex {

    public static void main(String[] args) throws InterruptedException {



       //1. Open Chrome browser
        WebDriver driver = WebDriver_Factory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

       //2. Go to https://practice.cydeo.com/add_remove_elements/
        driver.get("https://practice.cydeo.com/add_remove_elements/");

       // 3. Click to “Add Element” button
        WebElement addElementButton = driver.findElement(By.xpath("//button[.='Add Element']"));

        Thread.sleep(2000);
        addElementButton.click();

       //4. Verify “Delete” button is displayed after clicking.
        WebElement deleteButton = driver.findElement(By.xpath("//button[@class = 'added-manually']"));

        System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed());

        //5. Click to “Delete” button.
        Thread.sleep(2000);
        deleteButton.click();

       //6. Verify “Delete” button is NOT displayed after clicking.


        //USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS

        try {
            System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed());

        }catch (StaleElementReferenceException e){
            System.out.println("StaleElementReferenceException is thrown");
            System.out.println("This means Web Element is completely deteled/gone after clicking.");
            System.out.println("deleteButton.isDisplayed() false");
        }



    }
}
