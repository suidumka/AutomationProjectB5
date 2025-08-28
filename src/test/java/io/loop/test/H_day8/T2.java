package io.loop.test.H_day8;

import io.loop.test.Utilities.LoopcampUtils;
import io.loop.test.base.TestBase;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class T2 extends TestBase {
    @Test
    public void T2() throws InterruptedException {
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        driver.manage().window().maximize();

        String expectedType = "Thin Crust";
        String actualType =  LoopcampUtils.returnAnyFrieldFromTable(driver, "Alexandra Gray", "type");
        assertEquals(actualType, expectedType, "No match : name & type");

        String expectedAmount = "2";
        String actualAmount =  LoopcampUtils.returnAnyFrieldFromTable(driver, "Alexandra Gray", "amount");
        assertEquals(actualAmount, expectedAmount, "No match : name & amount");

        String expectedDate = "04/15/2021";
        String actualDate =  LoopcampUtils.returnAnyFrieldFromTable(driver, "Alexandra Gray", "date");
        assertEquals(actualDate, expectedDate, "No match : name & date");

        String expectedStreet = "7, Miller Street";
        String actualStreet =  LoopcampUtils.returnAnyFrieldFromTable(driver, "Alexandra Gray", "street");
        assertEquals(actualStreet, expectedStreet, "No match : name & street");

        String expectedCity = "Chicago, IL";
        String actualCity =  LoopcampUtils.returnAnyFrieldFromTable(driver, "Alexandra Gray", "city");
        assertEquals(actualCity, expectedCity, "No match : name & city");

        String expectedState = "US";
        String actualState =  LoopcampUtils.returnAnyFrieldFromTable(driver, "Alexandra Gray", "state");
        assertEquals(actualState, expectedState, "No match : name & state");

        String expectedZip = "748";
        String actualZip =  LoopcampUtils.returnAnyFrieldFromTable(driver, "Alexandra Gray", "zip");
        assertEquals(actualZip, expectedZip, "No match : name & zip");

        String expectedCard = "VISA";
        String actualCard =  LoopcampUtils.returnAnyFrieldFromTable(driver, "Alexandra Gray", "card");
        assertEquals(actualCard, expectedCard, "No match : name & card");

        String expectedCardNum = "321456789012";
        String actualCardNum =  LoopcampUtils.returnAnyFrieldFromTable(driver, "Alexandra Gray", "card number");
        assertEquals(actualCardNum, expectedCardNum, "No match : name & card number");

        String expectedExp = "02/24";
        String actualExp =  LoopcampUtils.returnAnyFrieldFromTable(driver, "Alexandra Gray", "exp");
        assertEquals(actualExp, expectedExp, "No match : name & Exp");

    }
}
/*
task2
=============

go to https://loopcamp.vercel.app/web-tables.html
create a method to test given field for a given name
test type
test amount
test date
test street
test city
test state
test zip
test card
test card number
test exp


 */