package com.cydeo.tests.Day8_properties_config_reader;

import com.cydeo.utilities.WebDriver_Factory;
import com.cydeo.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_WebTablePractice {

    /*



//Expected: “Bob Martin”

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

        Assert.assertEquals(actualNameOfBob, expectedNameOfBob);


        //3. VerifyBobMartin’s order date is as expected
        //Expected: 12/31/2021
            //-- //table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[3]

        WebElement bobMartinDateCELL =
                driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[3]"));

        System.out.println("bobMartinDateCELL.getText() = " + bobMartinDateCELL.getText());

        String expectedBobMartinDate = "12/31/2021";
        String actualBobMartinDate = bobMartinDateCELL.getText();

        Assert.assertEquals(expectedBobMartinDate,actualBobMartinDate);



    }



    @Test
    public void test2(){
       String costumerOrderDate1= WebTableUtils.returnOrderDate(driver,"Alexandra Gray");

        System.out.println("costumerOrderDate1 = " + costumerOrderDate1);

    }


    //Using WebTableUtils.orderVerify(); Method
    @Test
    public void test3(){

        WebTableUtils.oderVerify(driver, "Bart Fisher","01/16/2021");

    }


}
