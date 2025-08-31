package io.loop.test.day8;

import io.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

import static org.testng.Assert.assertEquals;

public class T2_windows extends TestBase {

    @Test
    public void windows(){

        //2. Go to : http://the-internet.herokuapp.com/windows
        driver.get("http://the-internet.herokuapp.com/windows");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //3. Assert: Title is “The Internet”
        assertEquals(driver.getTitle(), "The Internet", "NO MATCH");

        // returns the current window handle
        System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());

        //4. Click to: “Click Here” link -> it will open a new window
        WebElement clickHereButton = driver.findElement(By.xpath("//a[@href='/windows/new']"));
        clickHereButton.click();

        // we have opened a new window, but selenium doesn't go there itself, we have to switch

        //get original window handle : saving it's ID to be able to go back to it:
        String originalWindow = driver.getWindowHandle();
        //get all window handles - loop through the windows and stays at the last window
        Set<String> windowHandles = driver.getWindowHandles();

        for (String each : windowHandles){
            System.out.println("each window handle: " + each);
            driver.switchTo().window(each);
        }

        System.out.println("driver.getTitle() = " + driver.getTitle());

        //  5. Switch to new Window.
        assertEquals(driver.getTitle(), "New Window" ,"NO MATCH");

        //switch back to original window
        driver.switchTo().window(originalWindow);
        System.out.println("driver.getTitle() = " + driver.getTitle());



        driver.quit();
    }

}
/*
    1. Open a chrome browser
    2. Go to : http://the-internet.herokuapp.com/windows
    3. Assert: Title is “The Internet”
    4. Click to: “Click Here” link
    5. Switch to new Window.
    6. Assert: Title is “New Window”
     */