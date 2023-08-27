package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriver_Factory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T5_checkboxes {
    public static void main(String[] args) {


       // 1. Open Chrome and Go to http://practice.cydeo.com/checkboxes
        WebDriver driver = WebDriver_Factory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/checkboxes");

       // 2. Confirm checkbox #1 is NOT selected by default
        //TO DO ANY TASKS, YOU HAVE TO LOCATE WHERE THE CHECKBOXES ARE.
        WebElement checkbox_1 = driver.findElement(By.xpath("//input[@name='checkbox1']"));
        WebElement checkbox_2=  driver.findElement(By.xpath("//input[@name='checkbox2']"));

        //NOW YOU CAN CONFIRM
        System.out.println("checkbox_1.isSelected() = " + checkbox_1.isSelected());

        //3. Confirm checkbox #2 is SELECTED by default.
        System.out.println("checkbox_2.isSelected() = " + checkbox_2.isSelected());

        // 4. Click checkbox #1 to select it.
        checkbox_1.click();

       // 5. Click checkbox #2 to deselect it.
        checkbox_2.click();
       // 6. Confirm checkbox #1 is SELECTED.
        System.out.println("checkbox_1.isSelected(), expecting true = " + checkbox_1.isSelected());

        // 7. Confirm checkbox #2 is NOT selected.
        System.out.println("checkbox_2.isSelected()i expecting false = " + checkbox_2.isSelected());


    }
}
