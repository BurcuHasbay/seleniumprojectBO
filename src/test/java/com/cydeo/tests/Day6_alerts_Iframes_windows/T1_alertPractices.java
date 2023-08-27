package com.cydeo.tests.Day6_alerts_Iframes_windows;

import com.cydeo.utilities.WebDriver_Factory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_alertPractices {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
       // 1. Open browser
        driver = WebDriver_Factory.getDriver("firefox");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       // 2. Go to website: http://practice.cydeo.com/javascript_alerts
       driver.get("http://practice.cydeo.com/javascript_alerts");

    }

    @Test
    public void alert_T1() throws InterruptedException {

       // 3. Click to “Click for JS Alert” button
        WebElement informationAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));

        Thread.sleep(2000);
        informationAlertButton.click();



        //To be able to click to Alert OK button, we need to switch driver's focus to alert
        Alert alert = driver.switchTo().alert();

        // 4. Click to OK button from the alert
         alert.accept();

        // 5. Verify “You successfully clicked an alert” text is displayed.

        WebElement result_Text = driver.findElement(By.xpath("//p[@id = 'result']"));

        Assert.assertTrue(result_Text.isDisplayed(),"Result message/text is NOT displayed");


        String expectedText = "You successfully clicked an alert";
        String actualText = result_Text.getText();

        Assert.assertEquals(actualText, expectedText, "Actual text is not as expected");



    }





}
