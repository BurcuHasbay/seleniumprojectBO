package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

private Driver(){}

    private static WebDriver driver;


    public static WebDriver getDriver(){

        if (driver == null){
            String browserType = ConfigurationReader.getProperty("browser");

            switch (browserType){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;


            }
                }
                return driver;


        }



        // If my driver session ID is NOT NULL, I want to make it Null- this completely terminates
    //It makes its value always null after using quit() method.
        public static void closeDriver(){
        if (driver != null){
            driver.quit(); //This line will terminate the existing session. Value will not even be null
            driver = null;
        }
        //After this, it will create a new driver id. Ready to be used again
        }

    }





























