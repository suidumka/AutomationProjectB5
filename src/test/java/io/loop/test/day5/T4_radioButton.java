package io.loop.test.day5;

import io.loop.test.Utilities.LoopcampConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class T4_radioButton {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(LoopcampConstants.RADIOBUTTON_URL);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       // WebElement red =
    }
}
/*

        https://loopcamp.vercel.app/radio-buttons.html
        wait implicitly 10 seconds
        is selected
        is enabled
         */
