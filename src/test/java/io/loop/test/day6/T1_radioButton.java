package io.loop.test.day6;

import io.loop.test.Utilities.LoopcampConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class T1_radioButton {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(LoopcampConstants.RADIOBUTTON_URL);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement red = driver.findElement(By.xpath("//input[@id='red']"));
        WebElement green = driver.findElement(By.xpath("//input[@id='green']"));

        //isSelected
        System.out.println("red.isSelected() = Before clicking: " + red.isSelected());

        red.click();
        System.out.println("red.isSelected() = After clicking: " + red.isSelected());

        green.click();
        System.out.println("red.isSelected() = After clicking: " + green.isSelected());
        // if the button is disabled, it will not throw the exception.
        // it will try to click it, and the output will be false (not clicked)

        System.out.println("red.isSelected() = " + red.isSelected());
        System.out.println("green.isSelected() = " + green.isSelected());



        Thread.sleep(3000);

        // driver.quit();
        }
}
/*

        https://loopcamp.vercel.app/radio-buttons.html
        wait implicitly 10 seconds
        is selected
        is enabled
         */
