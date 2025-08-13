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


       // WebElement forgotPasswordHeading = driver.findElement(By.cssSelector("//div[@class='example']/h2"));
        //System.out.println("forgotPasswordHeading = " + forgotPasswordHeading);


    }
}
