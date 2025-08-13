package io.loop.day5;

import io.loop.Utilities.DocuportConstants;
import io.loop.Utilities.GeneralConstants;
import io.loop.Utilities.WebDriverUtil;
import org.openqa.selenium.*;

public class T2_xpath_getText {
    public static void main(String[] args) throws InterruptedException {
        // 1. open chrome
        // 2. go to docuport

        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);
        driver.manage().window().maximize();
        driver.get(DocuportConstants.DOCUPORT_URL_TEST);


        //3. click on forgot password
        WebElement forgotPaswword = driver.findElement(By.xpath("//a[@href='/reset-password']"));
        forgotPaswword.click();

        //4. validate url contains: reset-password
       String actualURL = driver.getCurrentUrl();
       String expectedURL = DocuportConstants.FORGOT_PASSWORD_URL;


       if(actualURL.equals(DocuportConstants.FORGOT_PASSWORD_URL)){
           System.out.println("Test PASSED");
       }else {
           System.out.println("Test FAILED");
       }

       // 5. validate - Enter the email address associated with your account
        WebElement validateMsg = driver.findElement(By.xpath("//div[contains(text(),'Enter')]"));
       String actualValidationMsg = validateMsg.getText();
       String expectedValidationMsg = DocuportConstants.RESET_PASSWORD_MSG;
       if(actualValidationMsg.equals(expectedValidationMsg)){
           System.out.println("Test PASSED");
       }else {
           System.out.println("Test FAILED");
       }

       // 6. enter forgotpasswordg1@gmail.com to email box
        WebElement emailInputBox = driver.findElement(By.xpath("//input[contains(@id,'input')]"));
        emailInputBox.click();

        String email = DocuportConstants.EMAIL_FOR_DOCUPORT;
        emailInputBox.sendKeys(email );


        // 7. validate send button is displayed
        WebElement sendButton = driver.findElement(By.xpath("//button[@type='submit']"));
        if (  sendButton.isDisplayed()){
            System.out.println("Send button: TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
        }


        // 8. validate cancel button is displayed
        WebElement cancelButton = driver.findElement(By.xpath("//span[contains(text(),'Cancel')]"));
        if (cancelButton.isDisplayed()){
            System.out.println("Cancel button: TEST PASSED");
        }else  {
            System.out.println("TEST FAILED");
        }

        // 9. click send button
       // WebElement sendButton2 = driver.findElement(By.xpath("//span[normalize-space()='Send']"));
        // [normalize-space()=' - helps to handle the spaces in html
        sendButton.click();


        // 10. validate - We've sent you an email with a link to reset your password. Please check your email
        // here we have a temporary message pop-up, which stays only for a few second

        WebElement successMsg;

        try{
            successMsg = driver.findElement(By.xpath("//span[@class='body-1']"));
        }catch (NoSuchElementException exc){
            exc.printStackTrace();
            Thread.sleep(5000);
            successMsg = driver.findElement(By.xpath("//span[@class='body-1']"));

        }

       System.out.println("successMsg.getText() = " + successMsg.getText());

        Thread.sleep(5000);
        try {
            System.out.println("successMsg.getText() = " + successMsg.getText());
        } catch (StaleElementReferenceException ex) {
            ex.printStackTrace();
            System.out.println("Element is not here anymore");
        }

        // (NoSuchElementException exc)  -- if element couldn't be found
        // (StaleElementReferenceException ex) - the message was there before, but now it has no access to it anymore


    }
}
/*
    1. open chrome
    2. go to docuport
    3. click on forgot password
    4. validate url contains: reset-password
    5. validate - Enter the email address associated with your account
    6. enter forgotpasswordg1@gmail.com to email box
    7. validate send button is displayed
    8. validate cancel button is displayed
    9. click send button
    10. validate - We've sent you an email with a link to reset your password. Please check your email
     */
