package io.loop.test.day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       Thread.sleep(3000);

        driver.get("https://www.loopcamp.io");

//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--start_maximized");
//        options.addArguments("--incognito"); // starts incognito page
        WebDriver driver1 = new ChromeDriver();

        Thread.sleep(3000);
        driver.navigate().to("https://www.google.com"); // navigates to the page

        Thread.sleep(3000); // just wait
        driver.navigate().back(); // opens loop -> then google -> then back to loopcamp page

        driver.navigate().forward(); // forwards the web page

        driver.navigate().refresh(); // refreshing the web page

        driver.quit(); // quitting the browser





    }
}
