package com.cydeo.tests.Day5_TestNG_Dropdowns;

import com.cydeo.utilities.WebDriver_Factory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T5_dropdownPractices {

    public WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){

        driver = WebDriver_Factory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get(" https://practice.cydeo.com/dropdown");


    }

    @Test
    public void dropdown_T5() throws InterruptedException {


        //We located the dropdown and it's ready to be selected.
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id = 'state']")));


//Use all Select options. (visible text, value, index)
        //3. Select Illinois
        Thread.sleep(2000);
        stateDropdown.selectByVisibleText("Illinois");

        //4. Select Virginia
        Thread.sleep(2000);
        stateDropdown.selectByValue("VA");

        //5. Select California
        Thread.sleep(2000);
        stateDropdown.selectByIndex(5);

        //6. Verify final selected option is California.
        String expectedOption_Text = "California";
        String actualOption_Test = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualOption_Test,expectedOption_Text);



    }

    @Test
    public void dropDown_T6 (){

      //FIRST LOCATE AND THEN CREATE 3 DIFFERENT OBJECTS FOR THE DIFFERENT DROPDOWNS
        //LOCATE NOW
        Select yearDropdown;
        yearDropdown = new Select(driver.findElement(By.xpath("//select[@id = 'year']")));
        Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id = 'month']")));
        Select dayDropdown = new Select(driver.findElement(By.xpath("//select[@id = 'day']")));

        //3. Select “December 1st, 1923” and verify it is selected.
        //Select year using : visible text
        yearDropdown.selectByVisibleText("1924");

        // Select month using : value attribute
        monthDropdown.selectByValue("11");

        // Select day using : index number
        dayDropdown.selectByIndex(0);


        //creating expected values
        String yearExpected = "1924";
        String monthExpected = "December";
        String dayExpected = "1";

        //Getting actual values from browsers
        String actualYear = yearDropdown.getFirstSelectedOption().getText();
        String actualMonth = monthDropdown.getFirstSelectedOption().getText();
        String actualDay = dayDropdown.getFirstSelectedOption().getText();

        Assert.assertTrue(actualYear.equals(yearExpected));
        Assert.assertEquals(actualMonth,monthExpected);
        Assert.assertEquals(actualDay,dayExpected);


    }



@AfterMethod
    public void tearDownMethod(){
        driver.close();
}





}
