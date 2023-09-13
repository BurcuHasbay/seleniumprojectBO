package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class LibraryLogInPage {

    //#1 Initialize the driver instance and the object of the class
    public LibraryLogInPage(){
        //İnitElements method will create connection in between the current driver session (instance)
        // and the object of the current class.
        PageFactory.initElements(Driver.getDriver(), this);
    }








}