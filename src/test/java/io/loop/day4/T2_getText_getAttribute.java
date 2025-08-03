package io.loop.day4;

import io.loop.Utilities.DocuportConstants;
import io.loop.Utilities.GeneralConstants;
import io.loop.Utilities.LoopcampConstants;
import io.loop.Utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_getText_getAttribute {
    public static void main(String[] args) {

        // go to url
        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);
        driver.manage().window().maximize();
        //driver.navigate().to("https://loopcamp.vercel.app/registration_form.html"); // or instead of this we can make it resuable:
        driver.navigate().to(LoopcampConstants.REGISTRATION_FORM_URL);

        //spy / locate / inspect login button and click it
        WebElement header = driver.findElement(By.tagName("h2"));

        // use getText() method
        String actualHeaderForForm = header.getText();
        System.out.println("actualHeaderForForm = " + actualHeaderForForm);

        //validation
        if (actualHeaderForForm.equals(LoopcampConstants.EXPECTED_HEADER_FOR_FORM)){
            System.out.println("Expected header for form: " + LoopcampConstants.EXPECTED_HEADER_FOR_FORM + ", matches actual header: " + actualHeaderForForm + "=> TEST PASS");
        }else {
            System.out.println("Expected header for form: " + LoopcampConstants.EXPECTED_HEADER_FOR_FORM + ", DOES NOT match actual header: " + actualHeaderForForm + "=> TEST FAIL");
        }

        // use get attribute method which will return the value of the attribute, not the text
        WebElement firstNamePlaceHolder = driver.findElement(By.name("firstname"));

        /* firstNamePlaceHolder.getAttribute("placeholder");
        System.out.println("firstNamePlaceHolder = " + firstNamePlaceHolder.getDomAttribute("placeholder"));
        * */

        String actualNamePlaceHolderForFirstName = firstNamePlaceHolder.getAttribute("placeholder");

        if (actualNamePlaceHolderForFirstName.equals(LoopcampConstants.EXPECTED_PLACEHOLDER_FOR_FIRSTNAME)){
            System.out.println("Expected placeholder form: " + LoopcampConstants.EXPECTED_PLACEHOLDER_FOR_FIRSTNAME + ", matches actual placeholder: " + actualNamePlaceHolderForFirstName + "=> TEST PASS");
        }else {
            System.out.println("Expected placeholder form: " + LoopcampConstants.EXPECTED_PLACEHOLDER_FOR_FIRSTNAME + ", DOES NOT match actual placeholder: " + actualNamePlaceHolderForFirstName + "=> TEST FAIL");
        }

    }
}
/*
    go to url: https://loopcamp.vercel.app/registration_form.html
    validate header text expected:  Registration form
    validate placeholder attribute value for first name expected - first name
     */