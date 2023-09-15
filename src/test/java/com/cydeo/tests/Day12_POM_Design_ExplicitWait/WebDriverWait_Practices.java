package com.cydeo.tests.Day12_POM_Design_ExplicitWait;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class WebDriverWait_Practices {


    @Test
    public void dynamic_load_7_Test(){
    //1. Go to https://practice.cydeo.com/dynamic_loading/7

        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/7");

        //2. Wait until title is “Dynamic title”
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        //3.use the "wait" object  to be able to create certain condition to wait
        wait.until(ExpectedConditions.titleIs("Dynamic title"));

        //4. Assert: Message “Done” is displayed.

    }

}
/*




//4. Assert: Image is displayed.
//Note: Follow POM
 */