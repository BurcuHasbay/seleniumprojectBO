package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_Utilities {

    //This method will log in with helpdesk1@cybertekschoo.com

    public static void crm_LogIn(WebDriver driver) {
//3. Enter valid username
        WebElement inputUserName = driver.findElement(By.xpath("//input[@name= 'USER_LOGIN']"));

        inputUserName.sendKeys("helpdesk1@cybertekschool.com");

        //4. Enter valid password
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name= 'USER_PASSWORD']"));

        inputPassword.sendKeys("UserUser");

        //5. Click to`LogIn`button
        WebElement logInButton = driver.findElement(By.xpath("//input[@value = 'Log In']"));

        //5. Click to`LogIn`button
        logInButton.click();


    }


    public static void crm_LogIn(WebDriver driver, String username, String password) {
        //3. Enter valid username
        WebElement inputUserName = driver.findElement(By.xpath("//input[@name= 'USER_LOGIN']"));

        inputUserName.sendKeys(username);

        //4. Enter valid password
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name= 'USER_PASSWORD']"));

        inputPassword.sendKeys(password);

        //5. Click to`LogIn`button
        WebElement logInButton = driver.findElement(By.xpath("//input[@value = 'Log In']"));

        //5. Click to`LogIn`button
        logInButton.click();


    }
}
