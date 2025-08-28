package io.loop.test.H_day8;

import io.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class T3 extends TestBase {

    @Test
    public void T3(){
        driver.get("https://loopcamp.vercel.app/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("//*[contains(text(),'Multiple W')]")).click();

        //Validate "Powered by Loopcamp" is displayed
        WebElement poweredByLoopcamp = driver.findElement(By.xpath(
                "//div[@style='text-align: center;' " +
                        "and contains(.,'Powered by') and contains(.,'LOOPCAMP' )]"));

        System.out.println("The sign \"Powered By Loopcamp\" is displayed: " + poweredByLoopcamp.isDisplayed());

        //Validate title is "Windows"
        System.out.println("Title of original window: " + driver.getTitle());

        //Click - click here
        driver.findElement(By.xpath("//*[contains(text(),'Click')]")).click();

        //Switch to new window and validate title
       String originalWindowId = driver.getWindowHandle();

       Set <String> windows = driver.getWindowHandles();

       for (String each : windows){
           System.out.println("each window handle: " + each);
           driver.switchTo().window(each);
       }
        System.out.println("Title of new window: " + driver.getTitle());
    }
}

/*
task3
=============

go to https://loopcamp.vercel.app/
click "Multiple Windows" link
Validate "Powered by Loopcamp" is displayed
Validate title is "Windows"
Click - click here
Switch to new window and validate title

 */