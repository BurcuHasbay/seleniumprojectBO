package com.cydeo.tests.day2_getTest_getAttribute;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkText_Practice {

    public static void main(String[] args) {



        /*
        TC #2: Back and forth navigation
    1- Open a chrome browser
    2- Go to: https://practice.cydeo.com
    3- Click to A/B Testing from top of the list.
    4- Verify title is:
    Expected: No A/B Test
    5- Go back to home page by using the .back();
    6- Verify title equals:
    Expected: Practice
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com");


        // 3- Click to A/B Testing from top of the list.
       // driver.findElement(By.linkText("A/B Testing")).click();

    // OR YOU CAN USE THIS WAY

        WebElement abTestLink = driver.findElement(By.linkText("A/B Testing"));
         abTestLink.click();




        //5- Go back to home page by using the .back();
        driver.navigate().back();



    }
}
