package com.cydeo.tests.day2_getTest_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {
    public static void main(String[] args) {


       /* TC#3: Google search
        1- Open a chrome browser
        2- Go to: https://google.com
        3- Write “apple” in search box
        4- Click google search button
        5- Verify title:
        Expected: Title should start with “apple” word
      */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2- Go to: https://google.com
        driver.get("https://www.google.com");

        //Write “apple” in search box
        WebElement googleSearch = driver.findElement(By.name("q"));
       //4- PRESS ENTER by using keys.ENTER
        googleSearch.sendKeys("apple" +  Keys.ENTER);

        // 5- Verify title:
        //Expected: Title should start with “apple” word
        String expectedTitle = "apple";
        String actualTitle= driver.getTitle();
        if (actualTitle.startsWith(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else {
            System.out.println("Title verification FAILED!");
        }

        



    }
}
