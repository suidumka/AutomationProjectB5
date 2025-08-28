package io.loop.test.day6;

import io.loop.test.Utilities.GeneralConstants;
import io.loop.test.Utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import static org.testng.Assert.*;

import java.time.Duration;
import java.util.List;

public class T7_multi_dropdown {
    WebDriver driver;
    String actual;
    String expected;

    @BeforeMethod
    public void setUpMethod(){
        driver= WebDriverUtil.getDriver(GeneralConstants.CHROME);
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void multiSelect(){
        // create dropdown
        Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='cars']")));

        //there is a method which tells us if the dropdown is multiselect or not
        assertTrue(dropdown.isMultiple(), "Dropdown is not multi select");


    /*  Multi-select:  Option: 1

        dropdown.selectByIndex(0);
        dropdown.selectByValue("saab");
        dropdown.selectByVisibleText("Opel");
        dropdown.deSelectByContainsVisibleText("Au");*/

    /*  Multi-select:   Option: 2

        List< WebElement> options = dropdown.getOptions();

        for (WebElement option : options){
            option.click();
            System.out.println("option = " + option.getText());}*/

    /*  Multi-select: Option: 3
        List< WebElement> options = dropdown.getOptions();

        options.forEach(option -> {
            option.click();
            System.out.println("option.getText() = " + option.getText());
        });*/

        // Multi-select: Option: 4

        List< WebElement> options  = dropdown.getOptions();

        options.forEach(WebElement::click);


        //   5. Deselect all values.

        dropdown.deselectAll();

    }


}

/*

    1. Open Chrome browser
    2. Go to https://demoqa.com/select-menu
    3. Select all the options from multiple select dropdown.
    4. Print out all selected values.
    5. Deselect all values.
     */
