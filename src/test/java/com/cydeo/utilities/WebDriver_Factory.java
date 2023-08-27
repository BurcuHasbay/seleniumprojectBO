package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriver_Factory {

    public static WebDriver getDriver(String browserType) {

        if (browserType.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();

        } else if (browserType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }


    return null;
        }

    }




/*
NEW METHOD CREATION
METHOD NAME: getDriver
Static method
Accepts String arg: browsertype
---This arg will determine what type of browser is opened
---If "chrome" passed--> it will open chrome browser
---If "firefox" passed---> it will open firefox browser
RETURN TYPE : "WebDriver"
 */