package com.cydeo.tests.Day5_TestNG_Dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {






    @BeforeClass
    public void setupMethod (){
        System.out.println(">>>BeforeClass is running...");
    }

    @AfterClass
    public void tearDownClass(){
        System.out.println(">>>AfterClass is running...");
    }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("BeforeMethod is running...");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("AfterMethod is running...");
    }















@Test
    public void test1(){

    System.out.println("Test 1 is running...");


    Assert.assertEquals("actual","actual");
    //ASSERT EQUALS: COMPARING 2 OF THE SAME THING.
    String actual = "apple";
    String expected = "apple";






}


    @Test
    public void test2(){

        System.out.println("Test 2 is running...");


        String actual = "apple";
        String expected = "apple2";

        Assert.assertTrue(actual.equals(expected));



    }

}
