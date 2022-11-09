package com.techproed.tests;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG01_Annotation {

    //Test is used to create test cases on testng
    //@BeforeMethod is used to run Before each @Test annotation. Same as @Before in JUnit
    //@AfterMethod is used after each @Test annotation
    //@Ignore is used to skip a @Test annotation
    // @Test(enabled = false) also skips the test annotation
    //Ordering the test cases= test cases executes based on alphabetical order.not from top to bottom
    //we use priority to run in specific order

    /*
    -Why would you need @BeforeMethod annotation
    =Pre conditions, creating driver, maximizing, time outs
    -Why would you need @AfterMethod annotation
     =Post conditions, for closing the driver, to avoid repetition, reports generation
     -Why would you need @BeforeMethod annotation
     =to create test case
     */

    @BeforeMethod
    public void setUp() {
        System.out.println("Before Method");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("After Method");
    }

    @Test(priority = 1)
    public void test6() {
        System.out.println("Test6");
    }

    @Test(priority = -2)
    public void test1() {
        System.out.println("Test1");
    }

//    //bu sekil de ayni ignore gibi calisir.
//    @Test(enabled = false)
//    public void test2(){
//        System.out.println("Test2");
//    }
//
//    @Ignore
//    @Test
//    public void test3(){
//        System.out.println("Test3");
//    }

    @Test(priority = 3)
    public void test4() {
        System.out.println("Test4");
    }

}
