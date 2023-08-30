package com.cydeo.tests.Base;

import com.cydeo.utilities.WebDriver_Factory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {

    WebDriver driver;
    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriver_Factory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }


}
