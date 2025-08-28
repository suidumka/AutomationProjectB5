package io.loop.test.ZZZpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class aa {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.loopcamp.io/");
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement classScheduleButton = driver.findElement(By.xpath("//p[contains(normalize-space(.), 'Class Schedule')]"));
        classScheduleButton.click();



    }

}
