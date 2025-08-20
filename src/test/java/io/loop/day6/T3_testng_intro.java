package io.loop.day6;

import org.testng.annotations.*;
import static org.testng.Assert.*;

public class T3_testng_intro {

    @Test (priority = 2)
    public void test1(){
        System.out.println("Test 1 is running");
        String actual = "Suidum";
        String expected = "Alim";
       // Assert.assertEquals(actual, expected, "Actual does NOT match expected");
        // if we import -> import static org.testng.Assert.*; -> we can use this way only:
        assertEquals(actual, expected, "Actual does NOT match expected");
    }

    @Test (priority = 0)
    public void test2(){
        System.out.println("Test 2 is running");
        String actual = "Tom";
        String expected = "Tom";
        assertEquals(actual, expected, "This msg will be shown only if the test fails");
    }


    @BeforeMethod
    public void setUpMethod(){
        System.out.println("Before method is running");
    }

    @AfterMethod  //rung after each method
    public void tearDownMethod(){
        System.out.println("After method us running");
    }

    @BeforeClass // rung after each class
    public void setUp(){
        System.out.println("Before  class method is running\n" );
    }

    @AfterClass
    public void tearDown(){
        System.out.println("\nAfter  class method is running\n" );
    }





}
