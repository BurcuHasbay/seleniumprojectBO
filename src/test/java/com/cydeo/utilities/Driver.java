package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;

public class Driver {

    /*
    Creating a private constructor so that we can close accessing to the object
    of thşs class from outside the class.
     */
    private Driver(){}

    /*
    We make WebDriver private, because we want to close access from outside of the class.
    We make it static because, we will use it in a static method.
     */
    private static WebDriver driver;



}
