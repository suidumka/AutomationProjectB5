package io.loop.H_day02;

import io.loop.Utilities.DocuportConstants;
import io.loop.Utilities.GeneralConstants;
import io.loop.Utilities.LoopcampConstants;
import io.loop.Utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class t1 {
    public static void main(String[] args) throws InterruptedException {
   WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);
   driver.manage().window().maximize();

   driver.get(LoopcampConstants.FORGOT_FORM_URL);

        //Locate forgot password
        WebElement forgotPassword = driver.findElement(By.cssSelector("div[class='example']>h2"));
        String actualForgotPassword = forgotPassword.getText();
        String expectedForgotPassword = LoopcampConstants.EXPECTED_FORGOT_PASSWORD;

        if (actualForgotPassword.equalsIgnoreCase(expectedForgotPassword)){
            System.out.println("Expected: " + expectedForgotPassword + ", matches actual: " + actualForgotPassword + "=> TEST PASS");
        }else {
            System.out.println("Expected: " + expectedForgotPassword + ", DOES NOT match actual: " + actualForgotPassword + "=> TEST FAIL");
        }


        // locate email:
        WebElement email = driver.findElement(By.cssSelector("label[for=\"email\"]"));
        String actualEmail = email.getText();
        String expectedEmail = LoopcampConstants.EXPECTED_EMAIL;

        if (actualEmail.equalsIgnoreCase(expectedEmail)){
            System.out.println("Expected: " + expectedEmail + ", matches actual: " + actualEmail + "=> TEST PASS");
        }else {
            System.out.println("Expected: " + expectedEmail + ", DOES NOT match actual: " + actualEmail + "=> TEST FAIL");
        }


        // email input
        WebElement emailInput = driver.findElement(By.cssSelector("input[type='text']"));
        String actualEmailInput = emailInput.getDomAttribute("name");
        String expectedEmailInput = LoopcampConstants.EXPECTED_EMIAL_INPUT;

        if (actualEmailInput.equalsIgnoreCase(expectedEmailInput)){
            System.out.println("Expected: " + actualEmailInput + ", matches actual: " + expectedEmailInput + "=> TEST PASS");
        }else {
            System.out.println("Expected: " + actualEmailInput + ", DOES NOT match actual: " + expectedEmailInput + "=> TEST FAIL");
        }

        //locate retrieve password
        WebElement retrievePassword = driver.findElement(By.cssSelector("i[class='icon-2x icon-signin']"));
        String actualRetrievePassword = retrievePassword.getText();
        String expectedRetrievePassword = LoopcampConstants.EXPECTED_RETRIEVE_PASSWORD;

        if (expectedRetrievePassword.equalsIgnoreCase(actualRetrievePassword)){
            System.out.println("Expected: " + expectedRetrievePassword + ", matches actual: " + actualRetrievePassword + "=> TEST PASS");
        }else {
            System.out.println("Expected: " + expectedRetrievePassword + ", DOES NOT match actual: " + actualRetrievePassword + "=> TEST FAIL");
        }


        //locate powered by LOOPCAMP
        WebElement poweredByLoopcamp = driver.findElement(By.cssSelector("div[style='text-align: center;'"));
        String actualPoweredByLoopcamp = poweredByLoopcamp.getText();
        String expectedPoweredByLoopcamp = LoopcampConstants.EXPECTED_POWERED_BY_LOOPCAMP;

        if (actualEmailInput.equalsIgnoreCase(expectedEmailInput)) {
            System.out.println("Expected: " + expectedPoweredByLoopcamp + ", matches actual: " + actualPoweredByLoopcamp + "=> TEST PASS");
        }else {
            System.out.println("Expected: " + expectedPoweredByLoopcamp + ", DOES NOT match actual: " + actualPoweredByLoopcamp + "=> TEST FAIL");
        }

        Thread.sleep(5000);

        driver.quit();

    }
}
/*
task 1
=============
go to https://loopcamp.vercel.app/forgot-password.html
locate 5 elements:
 forgot password,
 email,
 email input,
  retrieve password,
   powered by LOOPCAMP
use css
Validate those elements are displayed



 */