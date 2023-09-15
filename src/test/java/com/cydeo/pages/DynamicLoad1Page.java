package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoad1Page {


    //Creating Constructor First
    public DynamicLoad1Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



}
