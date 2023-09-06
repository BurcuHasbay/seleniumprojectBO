package com.cydeo.tests.Day9_JavaFaker_TestBase_DriverUtil;

import org.testng.annotations.Test;

public class SingletonPractice {

    @Test
    public void singleton_understand_test1(){

        String str1= Singleton.getWord();

        System.out.println("str1 = " + str1);

    }


}
