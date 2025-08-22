package io.loop.test.day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsPractice {
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions(); // create an option of chrome options

        options.addArguments("--start-maximized"); // add argument to that option

        WebDriver driver = new ChromeDriver(options); // start chrome with that option

        driver.get("https://www.google.com"); // navigate




    }
}
