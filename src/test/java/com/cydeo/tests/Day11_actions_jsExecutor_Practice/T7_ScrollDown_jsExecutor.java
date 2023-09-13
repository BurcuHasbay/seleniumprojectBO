package com.cydeo.tests.Day11_actions_jsExecutor_Practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T7_ScrollDown_jsExecutor {


    /*
   //#7: Scroll using JavascriptExecutor


//4- Scroll up to “Home” link
//5- Use below provided JS method only
//JavaScript method to use : arguments[0].scrollIntoView(true)
//Note: You need to locate the links as web elements and pass them as arguments into executeScript() method

     */

    @Test
    public void task7_scroll_Test(){
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/large
        Driver.getDriver().get("https://practice.cydeo.com/large");

        //3- Scroll down to “Cydeo” link
        //Locate the CYDEO link first.
        WebElement cydeoLink= Driver.getDriver().findElement(By.linkText("CYDEO"));
        //Locate Home Link first.
        WebElement homeLink=Driver.getDriver().findElement(By.linkText("Home"));


    }

}
