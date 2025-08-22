package io.loop.test.H_day06;

import io.loop.test.Utilities.GeneralConstants;
import io.loop.test.Utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.time.Duration;


public class t1 {


    WebDriver driver;
    String actual;
    String expected;


    @BeforeMethod
    public void setUpMethod(){
    driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);
    driver.manage().window().maximize();
    }


    @AfterMethod
    public void tearDropDown () throws InterruptedException {
    Thread.sleep(3000);
    driver.quit();
    }

    @Test
    public void herokuTest() throws InterruptedException {
    driver.get(GeneralConstants.HEROKUAPP_DROPDOWN_MENU);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement defaultDropdown = driver.findElement(By.xpath("//option[normalize-space()='Please select an option']"));
        WebElement option1Dropdown = driver.findElement(By.xpath("//option[@value='1']"));
        WebElement option2Dropdown = driver.findElement(By.xpath("//option[@value='2']"));

      //isSelected
        System.out.println("defaultDropdown.isSelected() = " + defaultDropdown.isSelected()); //defaultDropdown.isSelected() = true

        //option1
        System.out.println("option1Dropdown before clicking = " + option1Dropdown.isSelected());
        Thread.sleep(3000);
        option1Dropdown.click();
        System.out.println("option1Dropdown after clicking = " + option1Dropdown.isSelected()); //option1Dropdown.isSelected() = true

        //option2
        System.out.println("option2Dropdown before clicking = " + option2Dropdown.isSelected());
        Thread.sleep(3000);
        option2Dropdown.click();
        System.out.println("option2Dropdown after clicking = " + option2Dropdown.isSelected()); //option2Dropdown.isSelected() = true


        WebElement nameDropdownList = driver.findElement(By.xpath("//h3[normalize-space(.)='Dropdown List']"));
        actual = nameDropdownList.getText();
        expected = "Dropdown List";
        assertEquals(actual,expected,"Actual " + actual +" DOES NOT MATCH " + expected);

        if(actual.equals(expected)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }



    }

        /*
    go to http://the-internet.herokuapp.com/dropdown
validate "Please select an option" is selected by default
Choose option 1 and validate that it is selected
Choose option 2 and validate that it is selected
Validate dropdown name is "Dropdown List"


     */








}
