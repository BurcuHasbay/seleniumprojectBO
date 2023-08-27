package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriver_Factory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_cssSelector_practice {

    public static void main(String[] args) {

        /*
        TC #1: XPATH and cssSelector Practices
1. Open Chrome browser
2. Go to https://practice.cydeo.com/forgot_password
3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
   a. “Home” link--Locate 'Home' Link using CssSelector
   b. “Forgot password” header--Locate Header using cssSelector:
   >>>Locate parent element and go down to h2
   c. “E-mail” text
   d. E-mail input box
   e. “Retrieve password” button
   f. “Powered by Cydeo text
   4. Verify all web elements are displayed.
   First solve the task with using cssSelector only.
Try to create 2 different
cssSelector if possible

         */

        WebDriver driver = WebDriver_Factory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/forgot_password");

        WebElement homeLink_ex1 = driver.findElement(By.cssSelector("a[class='nav-link']"));

        //Syntax 2 of cssSelector
        WebElement homeLink_ex2 = driver.findElement(By.cssSelector("a.nav-link"));


        //Syntax 3 of cssSelector
        WebElement homeLink_ex3 = driver.findElement(By.cssSelector("a[href='/']"));

        //  b. “Forgot password” header--Locate Header using cssSelector:
        //   >>>Locate parent element and go down to h2
        WebElement header_ex1 = driver.findElement(By.cssSelector("div.example > h2"));


        //Locate header using XPATH and using Element Text--Cause relative xpath allows us to use TEXT
        WebElement header_ex2 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));

       // c. “E-mail” text
        WebElement emailLabel = driver.findElement(By.xpath("//label[@for='email']"));


        //d. E-mail input box
        WebElement inputBox_ex1 = driver.findElement(By.xpath("//input[@name='email']"));
        // Locate E-mail Input box using XPATH CONTAINS
        WebElement inputBox_ex2 = driver.findElement(By.xpath("//input[@name='email']"));
        WebElement inputBox__ex3 = driver.findElement(By.xpath("//input[contains(@pattern,'a-z')]"));


        //e. “Retrieve password” button
        WebElement retrievePasswordButton = driver.findElement(By.xpath("//button[@id = 'form_submit']"));

        // f. “Powered by Cydeo text
        WebElement CydeoText_ex1 = driver.findElement(By.xpath("//div[@style='text-align: center;']"));


            //4. Verify all web elements are displayed.
        System.out.println("homeLink_ex1.isDisplayed() = " + homeLink_ex1.isDisplayed());
        System.out.println("header_ex1.isDisplayed() = " + header_ex1.isDisplayed());
        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());
        System.out.println("inputBox_ex1.isDisplayed() = " + inputBox_ex1.isDisplayed());
        System.out.println("retrievePasswordButton.isDisplayed() = " + retrievePasswordButton.isDisplayed());
        System.out.println("CydeoText_ex1.isDisplayed() = " + CydeoText_ex1.isDisplayed());

    }
}
