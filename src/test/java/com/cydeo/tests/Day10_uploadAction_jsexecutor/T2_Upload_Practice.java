package com.cydeo.tests.Day10_uploadAction_jsexecutor;

import com.cydeo.utilities.Driver;
import org.testng.annotations.Test;

public class T2_Upload_Practice {

    @Test
    public void uploadTest(){

        //TC #2 Upload Test
        //1. Go to https://practice.cydeo.com/upload

        Driver.getDriver().get("https://practice.cydeo.com/upload");


       // 2. Find some small file from your computer, and get the path of it. 3. Upload the file.
        String path="/Users/burcuhasbay/Desktop/HOMEWORK 2PDF.pdf";


       // 4. Assert:
       // -File uploaded text is displayed on the page
    }

}
