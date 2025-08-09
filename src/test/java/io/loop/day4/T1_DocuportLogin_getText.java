package io.loop.day4;

import io.loop.Utilities.DocuportConstants;
import io.loop.Utilities.GeneralConstants;
import io.loop.Utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_DocuportLogin_getText {
    public static void main(String[] args) {
        // get the driver and navigate to docuport page

       // WebDriver driver = WebDriverUtil.getDriver("chrome"); //or instead of this we can make it resuable:
        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);
        driver.manage().window().maximize();

       //driver.get("https://beta.docuport.app"); // or instead of this we can make it resuable:
        driver.get(DocuportConstants.DOCUPORT_TEST);

        // locate username
        WebElement userName = driver.findElement(By.id("input-14"));
        userName.sendKeys(DocuportConstants.USERNAME_CLIENT);

        //spy / locate / inspect login button and click it
        WebElement loginButton = driver.findElement(By.className("v-btn__content"));
        loginButton.click();

        // get error message from UI
        WebElement errorMessage = driver.findElement(By.className("v-messages__message"));
        //System.out.println("Error: "+ errorMessage.getText());
        //System.out.println("userName.getText() = " + userName.getText());

        String actualErrorMsg = errorMessage.getText();
       // String expectedErrorMsg = "Please enter your password";  // or instead of this we can make it resuable:
        //validation:
        if (actualErrorMsg.equals(DocuportConstants.ERROR_MESSAGE_FOR_EMPTY_PASSWORD)){
            System.out.println("Expected error message: " + DocuportConstants.ERROR_MESSAGE_FOR_EMPTY_PASSWORD + ", matches actual error message: " + actualErrorMsg + "=> TEST PASS");
        }else {
            System.out.println("Expected error message: " + DocuportConstants.ERROR_MESSAGE_FOR_EMPTY_PASSWORD + ", DOES NOT match actual error message: " + actualErrorMsg + "=> TEST FAIL");
        }

        /*driver.quit();*/

    }
}
/*
 * go to docuport
 * enter username
 * do NOT enter password
 * click on login button
 * verify error message - please enter password
 */