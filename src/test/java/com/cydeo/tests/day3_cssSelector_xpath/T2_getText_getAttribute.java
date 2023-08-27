package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriver_Factory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {
    /*
TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Verify “remember me” label text is as expected:
Expected: Remember me on this computer
4- Verify “forgot password” link text is as expected:
Expected: Forgot your password?
5- Verify “forgot password” href attribute’s value contains expected:
Expected: forgot_password=yes

 */


    public static void main(String[] args) {

        WebDriver driver = WebDriver_Factory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");


//3- Verify “remember me” label text is as expected:
        WebElement rememberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));
        //Expected: Remember me on this computer
        String expectedRememberMeLabel = "Remember me on this computer";
        String actualRememberMeLabel = rememberMeLabel.getText();

        if (actualRememberMeLabel.equals(expectedRememberMeLabel)){
            System.out.println("Label verification PASSED");
        }else {
            System.out.println("Label verification FAILED");
        }

        //4- Verify “forgot password” link text is as expected:
       WebElement forgotPasswordLink = driver.findElement(By.className("login-link-forgot-pass"));

        String expectedForgotPasswordLink = "FORGOT YOUR PASSWORD?";
        String actualForgotPasswordLink = forgotPasswordLink.getText();

        if (actualForgotPasswordLink.equalsIgnoreCase(expectedForgotPasswordLink)){
            System.out.println("Forgot password link verification PASSEED");
        }else {
            System.out.println("actualForgotPasswordLink = " + actualForgotPasswordLink);
            System.out.println("expectedForgotPasswordLink = " + expectedForgotPasswordLink);
            System.out.println("Forgot your password link verification FAILED");
        }


        //5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes
        String expectedHref ="forgot_password=yes";
        String actualHrefAttributeValue = forgotPasswordLink.getAttribute("href");

        System.out.println("actualHrefAttributeValue = " + actualHrefAttributeValue);

        if (actualHrefAttributeValue.contains(expectedHref)){
            System.out.println("HRF attribute value PASSED");
        }else {
            System.out.println("HRF attribute value FAILED");
        }

    }
}

