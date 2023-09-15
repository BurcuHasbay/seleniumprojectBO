package com.cydeo.tests.Day13_review_and_practice;

import com.cydeo.pages.DoubleClickPage;
import com.cydeo.utilities.Driver;
import org.testng.annotations.Test;

public class T1_DoubleClick {

    @Test
    public void t1_double_click(){


        Driver.getDriver().get("//https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");

        //2. Switch to i frame.
        //An inline frame (iframe) is a HTML element that loads another HTML page within the document.
        Driver.getDriver().switchTo().frame(0);

        //3. Double click on the text “Double- click me to change my text color.”
        DoubleClickPage doubleClickPage = new DoubleClickPage();
        doubleClickPage.textToDoubleClick.click();


    }

}


/*
//#1: Double Click Test 1. Goto
//https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2


//4. Assert:Text’s“style”attribute value contains“red”.
//NOTE: FOLLOW POM
 */