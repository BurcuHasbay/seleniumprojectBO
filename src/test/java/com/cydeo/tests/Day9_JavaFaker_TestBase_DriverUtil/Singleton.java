package com.cydeo.tests.Day9_JavaFaker_TestBase_DriverUtil;

public class Singleton {


    //Create private constructor
    private Singleton(){
    }

    //create private static String
    private static String word;

    //Creating getter method. This utility method will return the "word" in the way we want to return
    public static String getWord(){
        if (word ==null){
            System.out.println("First time call. Word object is null. " + " Assigning value to it now!");

            word="something";
        }
    }


}
