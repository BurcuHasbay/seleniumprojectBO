package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriver_Factory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_cssSelector_getText {
    /*
    TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
3- Verify “Reset password” button text is as expected:
Expected: Reset password
PS: Inspect and decide which locator you should be using to locate web elements.
PS2: Pay attention to where to get the text of this button from
     */


    public static void main(String[] args) {

//1- Open a chrome browser
        WebDriver driver = WebDriver_Factory.getDriver("chrome");
        driver.manage().window().maximize();


//2-Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

//3- Verify “Reset password” button text is as expected:
        WebElement resetPasswordButton = driver.findElement(By.cssSelector("button[value= 'Reset password']"));

    String expectedResetPasswordButton = "Reset password";
    String actualResetPasswordButton = resetPasswordButton.getText();

    if (actualResetPasswordButton.equals(expectedResetPasswordButton)){
        System.out.println("Button text verification PASSED!");
    }else {
        System.out.println("Button text verification FAILED!");
    }


    }
}
