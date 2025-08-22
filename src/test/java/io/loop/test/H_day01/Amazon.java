package io.loop.test.H_day01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com/");
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
       searchBox.click();
       searchBox.clear();

        String textToSearch = "wooden spoon";
        searchBox.sendKeys(textToSearch);
        searchBox.sendKeys(textToSearch + Keys.ENTER);

        Thread.sleep(3000);

        // validdation
        String expectedResult = "Amazon";
        String actualResult = driver.getTitle();

        if (actualResult.contains(expectedResult)){
            System.out.println("Actual title " + actualResult + " matches expected title:  " + expectedResult + ". => TEST PASS");
        }else {
            System.err.println("Actual title " + actualResult + " DOES NOT match expected title:  " + expectedResult + ". => TEST FAIL");
        }


    }
}
