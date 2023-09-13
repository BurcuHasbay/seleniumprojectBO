package com.cydeo.tests.Day11_actions_jsExecutor_Practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropPractice {
    /*
   // #: Drag and drop
/
//3. Assert: -Text in big circle changed to: “You did great!”
     */


    @Test
    public void drag_drop_Test(){

        //1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        //Locate the Smaller Circle fist.
        WebElement SmallerCircle = Driver.getDriver().findElement(By.id("draggable"));
        //Locate The Bigger Circle First.
        WebElement BiggerCircle = Driver.getDriver().findElement(By.id("droptarget"));

        //Locate Accept Cookies Button to get rid of it. It's an eyesore.
        WebElement acceptCookiesButton = Driver.getDriver().findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
        acceptCookiesButton.click();

        //2. Drag and drop the small circle to bigger circle.
        //Creating an action Object here
        Actions actions = new Actions(Driver.getDriver());
        actions.dragAndDrop(SmallerCircle,BiggerCircle).perform();









    }
}
