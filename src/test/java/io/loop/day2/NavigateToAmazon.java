package io.loop.day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToAmazon {
    public static void main(String[] args) {
         /*
    navigate to amazon
    maximize
    navigate back
    navigate forward
    refresh
     */

        WebDriver driver1 = new ChromeDriver();
        driver1.navigate().to("https://www.amazon.com");

        driver1.manage().window().maximize();
        driver1.navigate().back();
        driver1.navigate().forward();
        driver1.navigate().refresh();


    }
}
