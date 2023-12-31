package com.cydeo.tests.Day10_uploadAction_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class T6_javascriptExecutor {

    @Test
    public void javascriptExecutor_Test() {

        //TC #6: Scroll using JavascriptExecutor
//1- Open a chrome browser
//2- Go to: https://practice.cydeo.com/infinite_scroll

        Driver.getDriver().get("https://practice.cydeo.com/infinite_scroll");

        // ((JavascriptExecutor)Driver.getDriver()).executeScript("");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        //3- Use below JavaScript method and scroll
        for (int i = 0; i <10 ; i++) {
            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0,2500)");
        }
        //window.scrollBy(0,750)


    }


    // a. 750 pixels down 10 times.
    // b. 750 pixels up 10 times
    //JavaScript method to use : window.scrollBy(0,0)
}
