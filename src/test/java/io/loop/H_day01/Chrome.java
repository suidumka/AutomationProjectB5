package io.loop.H_day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        WebElement searchBox = driver.findElement(By.className("gb_X"));
        //Thread.sleep(3000);
        searchBox.click();

        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();

        // validation

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Actual title " + actualTitle + " matches expected title:  " + expectedTitle + ". => TEST PASS");
        } else {
            System.err.println("Actual title " + actualTitle + " DOES NOT match expected title:  " + expectedTitle + ". => TEST FAIL");
        }

        driver.navigate().back();

        String expectedTitleForGoogle = "Google";
        String actualTitleForGoogle = driver.getTitle();

        if (actualTitleForGoogle.contains(expectedTitleForGoogle)){
            System.out.println("Actual title " + actualTitleForGoogle+ " matches expected title:  " + expectedTitleForGoogle + ". => TEST PASS");
        }else {
            System.err.println("Actual title " + actualTitleForGoogle + " DOES NOT match expected title:  " + expectedTitleForGoogle + ". => TEST FAIL");

        }
    }
}
