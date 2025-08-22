package io.loop.test.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locators {
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-blink-features=AutomationControlled");

        WebDriver driver = new ChromeDriver(options); // create the object of driver
        driver.manage().window().maximize();

        driver.get("https://www.google.com"); // navigate to google

        WebElement searchBoxWithID = driver.findElement(By.id("APjFqb")); // locate the element

        String textToSearch = "Feyruz is a king of JAVA "; // get a text to search


        Thread.sleep(3000); // add some wait

       searchBoxWithID.sendKeys(textToSearch); // type smth there what makes some actions from sendKeys list

        searchBoxWithID.clear(); // it will clear our request line ==>  String textToSearch = "Feyruz is a JAVA teacher";

        searchBoxWithID.sendKeys("Nadir is smart " + Keys.ENTER); // clicks enter

        driver.navigate().back();
        Thread.sleep(3000);

        WebElement searchBoxWithName = driver.findElement(By.name("q")); //locate search box with name

        searchBoxWithName.sendKeys(textToSearch + Keys.ENTER); // send text to the search box which is spied with name

        // navigate back again
        driver.navigate().back();

        WebElement aboutLink = driver.findElement(By.linkText("About"));// locate about with using linkText

        aboutLink.click(); // click that link



    }
}
