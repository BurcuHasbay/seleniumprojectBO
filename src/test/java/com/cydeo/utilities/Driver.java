package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;

public class Driver {

    /*
    Creating a private constructor so that we can close accessing to the object
    of thşs class from outside the class.
     */
    private Driver() {
    }

    /*
    We make WebDriver private, because we want to close access from outside of the class.
    We make it static because, we will use it in a static method.
     */
    private static WebDriver driver;


    /*
    Create a re-usable utility method which will return the same driver instance when we call it.
     */

    public static WebDriver getDriver() {
        if (driver == null) {

            /*
            This way we can control which browser is opened from outside our code.
             */
            String browserType = ConfigurationReader.getProperty("browser");

        }
        return driver;
    }


}
