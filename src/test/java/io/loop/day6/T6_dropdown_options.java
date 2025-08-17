package io.loop.day6;

import io.loop.Utilities.GeneralConstants;
import io.loop.Utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.time.Duration;

public class T6_dropdown_options {

    WebDriver driver;
    String actual;
    String expected;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);
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
    public void colorTest(){
        //create a dropdown
        Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='oldSelectMenu']")));

        //select yellow value - acc. to index (index starts with 0 )
        dropdown.selectByIndex(3);

        //validate that we selected yellow from dropdown menu
        String actualYellow = dropdown.getFirstSelectedOption().getText();
        String expectedYellow = "Yellow";
        assertEquals( actualYellow, expectedYellow, "Actual " + actualYellow + " Does NOT match with " + expectedYellow);


        //validate that we selected red from dropdown menu - select by value
        dropdown.selectByValue("red");
        String actualRed = dropdown.getFirstSelectedOption().getText();
        String expectedRed = "Red";
        assertEquals( actualRed, expectedRed, "Actual " + actualRed + " Does NOT match with " + expectedRed);

        // select white and validate - select by visible text
        dropdown.selectByVisibleText("White");
        String actualWhite = dropdown.getFirstSelectedOption().getText();
        String expectedWhite = "White";
        assertEquals( actualWhite, expectedWhite, "Actual " + actualWhite + " Does NOT match with " + expectedWhite);


    }



}
 /*
    1. Open Chrome browser
    2. Go to https://demoqa.com/select-menu
    3. go old style select menu
    4. Select Yellow and validate
    5. Select Red and validate
    6. Select White and validate
    Use all Select options. (visible text, value, index)
        */