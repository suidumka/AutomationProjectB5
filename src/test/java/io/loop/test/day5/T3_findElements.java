package io.loop.test.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class T3_findElements {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.nba.com");

        Thread.sleep(5000);
        //this way will wait only 5 seconds, no matter what. It doesn't check if elements are available
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //selenium 4
        // it waits that elements in page are available. if elements are loaded in 5 seconds, it will stop waiting

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10, TimeUnit.SECONDS)); //selenium 3

        List<WebElement> nbaLinks =  driver.findElements(By.tagName("a"));
        System.out.println("nbaLinks = " + nbaLinks.size());

        List<WebElement> nbaLickWIthXpath =  driver.findElements(By.xpath("//a"));
        System.out.println("nbaLickWIthXpath = " + nbaLickWIthXpath.size());

        for (WebElement nbaLink : nbaLinks) {
            if(!nbaLink.getText().equals("")){
                System.out.println("nbaLink = " + nbaLink);
                System.out.println("nbaLink.getAttribute(\"href\") = " + nbaLink.getAttribute("href"));
            }
        }

        for (int i = 0; i < nbaLinks.size(); i++) {
            if(!nbaLinks.get(i).getText().equals("")){
                System.out.println("nbaLinks.get(i).getText() = " + nbaLinks.get(i).getText());
                System.out.println("nbaLinks.get(i).getAttribute(\"href\") = " + nbaLinks.get(i).getAttribute("href"));
            }
        }

    }
}
/*
        1- Open a chrome browser
        2- Go to: https://www.nba.com
        3- Locate all the links in the page.
         */