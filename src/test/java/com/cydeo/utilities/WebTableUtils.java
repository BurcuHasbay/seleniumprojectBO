package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTableUtils {

    public static String returnOrderDate(WebDriver driver, String customerName){

        String locator = "//td[.='"+customerName+"']/following-sibling::td[3]";

        WebElement customerDateCell = driver.findElement(By.xpath(locator));

        return customerDateCell.getText();

        //OR

        /*
        public static String returnOrderDate2(WebDriver driver, String customerName) {
        return driver. findElement (By.path ("//td[.='"+customerName+"']/following-sibling::td[3]")).getText);

         */




    }



}



    /*

Method #1 info:
• Name: returnOrderDate ()
• Return type: String
• Arg1: WebDriver driver
• Arg2: String costumerName
This method should accept a costumerName and return the costumer order date as a String.



Method #2 info:
• Name: orderVerify ()
• Return type: void
• Arg1: WebDriver driver
• Arg2: String costumerName
• Arg3: String expectedOrderDate
This method should accept above mentioned arguments and internally assert expectedOrderDate matching actualOrderDate.
     */
