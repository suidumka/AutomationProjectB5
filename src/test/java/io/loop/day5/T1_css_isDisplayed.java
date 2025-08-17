package io.loop.day5;

import io.loop.Utilities.GeneralConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_css_isDisplayed {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(GeneralConstants.HEROKUAPP_URL);


       WebElement forgotPasswordHeading = driver.findElement(By.cssSelector("div[class='example']>h2"));
       // printing
        System.out.println("forgotPasswordHeading = " + forgotPasswordHeading.getText());

        // .isDisplaued() boolean - will return true or false depentind on the element is displayed at html
        System.out.println("forgotPasswordHeading = " + forgotPasswordHeading.isDisplayed());

        if (forgotPasswordHeading.isDisplayed()) {
            System.out.println("Test pass");
        }else {
            System.out.println("Test failed");
        }


    }
}
