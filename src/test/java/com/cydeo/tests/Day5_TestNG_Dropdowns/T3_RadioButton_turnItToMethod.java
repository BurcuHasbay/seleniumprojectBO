package com.cydeo.tests.Day5_TestNG_Dropdowns;

import com.cydeo.utilities.WebDriver_Factory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T3_RadioButton_turnItToMethod {

    public static void main(String[] args) {

        WebDriver driver = WebDriver_Factory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/radio_buttons");



        //Locate name = 'sport' radio buttons and select matching result "hockey"
        clickAndVerifyRadioButtons(driver,"sport","hockey");



    }
    private static void clickAndVerifyRadioButtons(WebDriver driver, String nameAttribute, String idValue){
        List<WebElement> radioButtons = driver.findElements(By.name(nameAttribute));
        for (WebElement each: radioButtons) {

            String eachID = each.getAttribute("id");

            if (eachID.equals(idValue)){
                each.click();
                System.out.println(eachID+ " is selected :" + each.isSelected());
                break;
            }

        }
    }

}
