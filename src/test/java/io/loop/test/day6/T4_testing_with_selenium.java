package io.loop.test.day6;

import io.loop.test.Utilities.DocuportConstants;
import io.loop.test.Utilities.GeneralConstants;
import io.loop.test.Utilities.WebDriverUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class T4_testing_with_selenium {

    WebDriver driver;
    String actual;
    String expected;


    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);
        driver.manage().window().maximize();
    }

    @Test
    public void googleTitle(){
        driver.get("https://www.google.com");
        System.out.println("((RemoteWebDriver) driver).getSessionId() = " + ((RemoteWebDriver) driver).getSessionId());
        //Output: ((RemoteWebDriver) driver).getSessionId() = 9e5482394611d23611ebbb593055d048
        // everytime we run the test, new ID is created
        // it means everytime we create a new driver => its not a good experience

        expected = "Google";
        actual = driver.getTitle();
        assertEquals(actual,expected, "Actual " + actual + ", does Not match "  + expected  );

    }

    @Test
    public void docuportTitle(){
        driver.get(DocuportConstants.DOCUPORT_URL_TEST);
        System.out.println("((RemoteWebDriver) driver).getSessionId() = " + ((RemoteWebDriver) driver).getSessionId());
        expected = "Docuport";
        actual = driver.getTitle();
        assertEquals(actual,expected, "Actual " + actual + ", does Not match "  + expected  );

    }

    @AfterMethod
    public void tearDownMethod(){
        driver.quit();
    } // closes drivers after each running  method



}
