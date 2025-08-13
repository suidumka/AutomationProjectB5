package io.loop.day4;

import io.loop.Utilities.DocuportConstants;
import io.loop.Utilities.GeneralConstants;
import io.loop.Utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_forgot_password {
    public static void main(String[] args) {

        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);
        driver.manage().window().maximize();

        // go to the url
        driver.get(DocuportConstants.DOCUPORT_URL_TEST);

        //locate the forget password link with css and click on it
        WebElement forgetPasswordLink = driver.findElement(By.cssSelector("a[href='/reset-password']"));
        forgetPasswordLink.click();

        WebElement forgetPasswordHeading = driver.findElement(By.cssSelector("div[class='login-layout__form']>h1"));
        System.out.println("forgetPasswordHeading = " + forgetPasswordHeading.getText());
    }
}
