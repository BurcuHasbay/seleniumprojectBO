package com.cydeo.tests.Day10_uploadAction_jsexecutor;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class T1_Registration_Form {


    @Test
    public void test1_registration(){

        //TC#1: Registration form confirmation
//Note: Use JavaFaker OR read from configuration.properties file when possible.
//1. Open browser
//2. Go to website:https://practice.cydeo.com/registration_form
     // Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));

      //Use configuration properties as possible.

       Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));

       //2. CREATE JAVA FAKER OBJECT
        Faker faker = new Faker();

       //3. Enter first name

        WebElement inputFirstName = Driver.getDriver().findElement(By.xpath("//input[@name = 'firstname']"));

        inputFirstName.sendKeys(faker.name().firstName());

        //4. Enter last name
        WebElement inputLastName = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));

        inputLastName.sendKeys(faker.name().lastName());

      // ANOTHER WAY >> userName.sendKeys(faker.name().username().replaceAll("\\.","")); //didn't work for me!

        WebElement userName= Driver.getDriver().findElement(By.xpath("//input[@name='username']"));

        String user = faker.bothify("helpdesk###");

        //5. Enter username
        userName.sendKeys((CharSequence) user);

        //6. Enter email address
        WebElement emailAddress = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));

        emailAddress.sendKeys(user + "@hotmail.com");

        //7. Enter password

        WebElement password = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));

        password.sendKeys(faker.numerify("########"));

        //8. Enter phone number
        WebElement phoneNumber = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        phoneNumber.sendKeys(faker.phoneNumber().phoneNumber().replaceAll(".",""));


        //9. Select a gender from radio buttons
        WebElement femaleButton = Driver.getDriver().findElement(By.xpath("//input[@value='female']"));

        femaleButton.click();

        //10.Enter date of birth
        WebElement dateOfBirth = Driver.getDriver().findElement(By.xpath("//input[@placeholder='MM/DD/YYYY']"));

        //faker.number().numberBetween(2003,1930);

        dateOfBirth.sendKeys("02/14/1994");

        //11.Select Department/Office
        Select departmentDropDown = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        departmentDropDown.selectByIndex(faker.number().numberBetween(1,9)); //To randomize the test data, doesn't matter what to choose here


        //12.Select Job Title


    }
}














//13.Select programming language from checkboxes
//14.Click to sign up button
//15.Verify success message “You’ve successfully completed registration.” is displayed.
//Note:1. Use new Driver utility class and method
//2. User JavaFaker when possible
//3. User ConfigurationReader when it makes sense
