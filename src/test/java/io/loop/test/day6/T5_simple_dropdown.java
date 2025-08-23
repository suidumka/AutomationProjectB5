package io.loop.test.day6;

import io.loop.test.Utilities.GeneralConstants;
import io.loop.test.Utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.time.Duration;

public class T5_simple_dropdown {
     /*
    1. Open Chrome browse
    2. Go to http://the-internet.herokuapp.com/dropdown
    3. Verify “Dropdown list” default selected value is correct - Expected: “Please select an option”
     */

    WebDriver driver;
    String actual;
    String expected = "Please select an option";

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverUtil.getDriver((GeneralConstants.CHROME));
        driver.manage().window().maximize();
    }


    @AfterMethod
    public void tearDownMethod(){
        driver.quit();
    }

    @Test
    public void dropDownTest() {
        driver.get("http://the-internet.herokuapp.com/dropdown");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // create a dropdown
        /*  Option 1 to locate a dropdown:
        WebElement dropdownElement = driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select dropdown = new Select(dropdownElement);*/

        // Option 2 - create an object of Select class and put it directly:
        Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));

        //validate default select
        actual = dropdown.getFirstSelectedOption().getText();
        assertEquals(actual, expected, "Actual " + actual + " Does NOT match with " + expected);


    }

























}
