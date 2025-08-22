
package io.loop.test.H_day02;

import io.loop.test.Utilities.DocuportConstants;
import io.loop.test.Utilities.GeneralConstants;
import io.loop.test.Utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class t2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);
        driver.manage().window().maximize();

        //input login to docuport application
        driver.get(DocuportConstants.DOCUPORT_URL_TEST);
        WebElement userLogin = driver.findElement(By.id("input-14"));
        userLogin.sendKeys(DocuportConstants.USERNAME_CLIENT);

        //input password to docuport application
        WebElement userPassword = driver.findElement(By.id("input-15"));
        userPassword.sendKeys(DocuportConstants.PASSWORD_FOR_LOGIN);

        //clicking login button
        WebElement clickLoginButton = driver.findElement(By.cssSelector("span[class='v-btn__content']"));
        clickLoginButton.click();
        Thread.sleep(3000);

        WebElement continueButton = driver.findElement(By.cssSelector("button[type='submit']"));
        continueButton.click();
        Thread.sleep(3000);

        WebElement batchInfoButton = driver.findElement(By.cssSelector("span[class='subtitle-2 text-none pl-2 pr-3 gray--text text--darken-3']"));

        if (batchInfoButton.isDisplayed()){
            System.out.println("Successful login ==> TEST PASS");
        }else {
            System.out.println("Login fail ==> TEST FAIL");
        }

        /*
        #2 Validate successful login
        String actualBatchInfoButton = batchInfoButton.getText();
        String expectedBatchInfoButton = DocuportConstants.BATCH_NUMBER;
        if (actualBatchInfoButton.equalsIgnoreCase(expectedBatchInfoButton)){
            System.out.printf("Pass");
        }else {
            System.out.printf("Fail");
        }*/

        batchInfoButton.click();
        Thread.sleep(3000);

        WebElement logoutButton = driver.findElement(By.id("list-item-154"));
        logoutButton.click();
        Thread.sleep(3000);

        //Validate successful logout
        WebElement logo = driver.findElement(By.cssSelector("img[src='/img/logo.d7557277.svg']"));
        String actualLogoDocuport = logo.getAttribute("alt");

        if (DocuportConstants.EXPECTED_LOGO_DOCUPORT.equalsIgnoreCase(actualLogoDocuport)){
            System.out.println("Successful logout ==> TEST PASS");
        }else {
            System.out.println("Logout fail ==> TEST FAIL");
        }
        Thread.sleep(3000);

        driver.quit();












    }
}

/*
task 2
=============
login to docuport application
logout from docuport application
Validate successful login
Validate successful logout



 */

