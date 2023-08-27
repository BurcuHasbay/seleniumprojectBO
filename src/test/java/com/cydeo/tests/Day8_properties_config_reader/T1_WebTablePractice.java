package com.cydeo.tests.Day8_properties_config_reader;

import com.cydeo.utilities.WebDriver_Factory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_WebTablePractice {

    /*



//Expected: “Bob Martin”
//3. VerifyBobMartin’s order date is as expected
//Expected: 12/31/2021
     */

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){

        driver = WebDriver_Factory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/web-tables");

    }

    @Test
    public void order_name_verify_Test(){


//You can use this
// - //table[@id='ctl00_MainContent_orderGrid']//tbody/tr[7]/td[2]
// but what if another name is added to the cell? Where would Bob's name go?
        //That is why, you need to use the text of the name.

        WebElement BobMartinCell = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));

        System.out.println("BobMartinCell.getText() = " + BobMartinCell.getText());

        //2. VerifyBob’s name is listed as expected.
        String expectedNameOfBob = "Bob Martin";
        String actualNameOfBob = BobMartinCell.getText();


    }






}
