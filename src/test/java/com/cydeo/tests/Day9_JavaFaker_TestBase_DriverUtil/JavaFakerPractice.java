package com.cydeo.tests.Day9_JavaFaker_TestBase_DriverUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {




  @Test

    public void test1(){

    //Creating Faker Object to reach methods
    Faker faker = new Faker();

    System.out.println("faker.name().firstName() = " + faker.name().firstName());

    System.out.println("faker.name().lastName() = " + faker.name().lastName());

    System.out.println("faker.address().fullAddress() = " + faker.address().fullAddress());


    System.out.println("faker.numerify(\"(507)-###-##-##\") = " + faker.numerify("(507)-###-##-##"));

    System.out.println("faker.chuckNorris().fact().replaceAll(\"Osman\") = " + faker.chuckNorris().fact().replaceAll("Chuck Norris","Osman"));

  }


}
