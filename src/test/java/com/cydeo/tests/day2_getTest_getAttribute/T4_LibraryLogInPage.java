package com.cydeo.tests.day2_getTest_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_LibraryLogInPage {

    public static void main(String[] args) {

//TC #4: Library verifications 1. Open Chrome brows er
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


      //Go to http://library2.cybertekschool.com/login.html
      driver.get("https://library2.cybertekschool.com/login.html");

      //3. Enter username: “incorrect@email.com”
        WebElement usernameInput = driver.findElement(By.className("form-control"));
        usernameInput.sendKeys("incorrect@email.com");

    //4. Enter password: “incorrect password”
        WebElement passwordInput = driver.findElement(By.id("inputPassword"));
        passwordInput.sendKeys("incorrect password");


    //5. Click to 'Sign in' button
        WebElement signInButton = driver.findElement(By.tagName("button"));
        signInButton.click();







    }
}
