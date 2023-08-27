package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriver_Factory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T4_findElementS {
    public static void main(String[] args) {


       // 1- Open a chrome browser
        WebDriver driver = WebDriver_Factory.getDriver("Chrome");
        driver.manage().window().maximize();

        //Providing extra time for the driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");

    //3- Locate all the links in the page.
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

    //4- Print out the number of the links on the page.
        System.out.println("allLinks.size() = " + allLinks.size());


        //5- Print out the texts of the links.Print out the HREF attribute values of the links
        for (WebElement each : allLinks) {
            System.out.println("Texts of the Link: " + each.getAttribute("href"));
            System.out.println("HREF: " + each.getAttribute("href"));
        }






    }
}
