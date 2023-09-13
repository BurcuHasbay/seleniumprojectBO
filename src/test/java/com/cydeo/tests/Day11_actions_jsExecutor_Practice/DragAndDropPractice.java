package com.cydeo.tests.Day11_actions_jsExecutor_Practice;

import com.cydeo.utilities.Driver;
import org.testng.annotations.Test;

public class DragAndDropPractice {
    /*
   // #: Drag and drop
//2. Drag and drop the small circle to bigger circle.
//3. Assert: -Text in big circle changed to: “You did great!”
     */


    @Test
    public void drag_drop_Test(){

        //1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

    }
}
