package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriver_Factory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_cssSelector {
        public static void main(String[] args) {
    //1- Open a chrome browser
            WebDriver driver = WebDriver_Factory.getDriver("Chrome");
            driver.manage().window().maximize();
    
            //Go to: https://login1.nextbasecrm.com/
    
            driver.get("https://login1.nextbasecrm.com/");
    
            //3- Verify “Log in” button text is as expected:
            //Expected: Log In
    
            //LOCATE IT USING CLASS ATTRIBUTE
           // WebElement logInButton = driver.findElement(By.cssSelector("input[class = 'login-btn']"));
            //LOCATE IT USING TYPE VALUE
            //WebElement logInButton = driver.findElement(By.cssSelector("input[type='submit']"));
    
            //LOCATE IT USING VALUE ATTRIBUTE
            WebElement logInButton = driver.findElement(By.cssSelector("input[value='Log.In']"));

            String expectedButtonText = "Log In";
            
            //getting value of the attribute "value"
            String actualButtonText = logInButton.getAttribute("value");
            System.out.println("actualButtonText = " + actualButtonText);

        if (actualButtonText.equals(expectedButtonText)){
            System.out.println("Log In button text verification PASSED");
        }else {
            System.out.println("Log In button text verification FAILED");
        }
    
    
    
        }

}



/*
TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Verify “Log in” button text is as expected:
Expected: Log In
PS: Inspect and decide which locator you should be using to locate web elements.
PS2: Pay attention to where to get the text of this button from
 */