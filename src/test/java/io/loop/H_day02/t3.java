package io.loop.H_day02;

import io.loop.Utilities.DocuportConstants;
import io.loop.Utilities.GeneralConstants;
import io.loop.Utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class t3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);
        driver.manage().window().maximize();

        //navigate to docuport webpage
        driver.get(DocuportConstants.DOCUPORT_TEST);

        //validate placeholders for username
        WebElement usernamePlaceholder = driver.findElement(By.cssSelector("label[for='input-14']"));
        String actualUsernamePlaceholder = usernamePlaceholder.getText();
        String expectedUsernamePlaceholder = DocuportConstants.EXPECTED_USERNAME_PLACEHOLDER;

        if (actualUsernamePlaceholder.equalsIgnoreCase(expectedUsernamePlaceholder)){
            System.out.println("Placeholder for username matches: TEST PASS");
        }else {
            System.out.println("Placeholder for username  DOES NOT match: TEST FAIL");
        }

        //validate placeholders for password
        WebElement passwordPlaceholder = driver.findElement(By.cssSelector("label[for='input-15']"));
        String actualPasswordPlaceholder = passwordPlaceholder.getText();
        String expectedPasswordPlaceholder = DocuportConstants.EXPECTED_PASSWORD_PLACEHOLDER;

        if (actualPasswordPlaceholder.equalsIgnoreCase(expectedPasswordPlaceholder)){
            System.out.println("Placeholder for password matches: TEST PASS");
        }else {
            System.out.println("Placeholder for password  DOES NOT match: TEST FAIL");
        }

        // click login button
        WebElement loginButton = driver.findElement(By.cssSelector("span[class='v-btn__content']"));
        loginButton.click();
        Thread.sleep(3000);



        WebElement usernameErrMsg = driver.findElement(By.cssSelector(".mb-4:nth-of-type(1) .v-messages__message"));
        //WebElement passwordErrMsg = driver.findElement(By.cssSelector("div.mb-4.col.col-12:nth-of-type(1) .v-messages__message"));
        String actualUsernameErrMsg = usernameErrMsg.getText();
        String expectedUsernameErrMsg = DocuportConstants.EXPECTED_ERROR_USERNAMEMESSAGE;

        if (expectedUsernameErrMsg.equalsIgnoreCase(expectedUsernameErrMsg)){
            System.out.println("Actual: " + actualUsernameErrMsg + ", matches with: " + expectedUsernameErrMsg + "=> TEST PASS");
        }else {
            System.out.println("Actual: " + actualUsernameErrMsg + ", DOES NOT match with: " + expectedUsernameErrMsg + "=> TEST FAIL");
        }

        WebElement passwordErrMsg = driver.findElement(By.cssSelector(".mb-4:nth-of-type(2) .v-messages__message"));
        // WebElement passwordErrMsg = driver.findElement(By.cssSelector("div.mb-4.col.col-12:nth-of-type(2) .v-messages__message"));
        String actualPasswordErrMsg = usernameErrMsg.getText();
        String expectedPasswordErrMsg = DocuportConstants.EXPECTED_ERROR_PASSWORDMESSAGE;

        if (expectedUsernameErrMsg.equalsIgnoreCase(expectedUsernameErrMsg)){
            System.out.println("Actual: " + actualPasswordErrMsg + ", matches with: " + expectedPasswordErrMsg + "=> TEST PASS");
        }else {
            System.out.println("Actual: " + actualPasswordErrMsg + ", DOES NOT match with: " + expectedPasswordErrMsg + "=> TEST FAIL");
        }

        Thread.sleep(3000);


    }
}
/*

task 3
=============
navigate to docuport application
validate placeholders for username and password
without sending username and password click login button
validate username and password error messages
 */