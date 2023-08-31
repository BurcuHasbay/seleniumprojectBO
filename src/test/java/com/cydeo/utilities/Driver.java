package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

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
        String browserType;
        if (driver == null) {

            /*
            This way we can control which browser is opened from outside our code.
             */
      String browserType = ConfigurationReader.getProperty("browser");

      switch (browserType){
          case "chrome":
              WebDriverManager.chromedriver().setup();
              driver = new ChromeDriver();
              driver.manage().window().maximize();
              driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

          case "firefox":
              WebDriverManager.firefoxdriver().setup();
              driver.manage().window().maximize();
              driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        }
        return driver;


        }

    }


}
