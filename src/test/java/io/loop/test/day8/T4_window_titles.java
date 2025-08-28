package io.loop.test.day8;

import io.loop.test.Utilities.BrowsersUtils;
import io.loop.test.base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class T4_window_titles extends TestBase {
    @Test
    public void windowHandleTitle(){
      /*  used to use before TAB code appeared
      ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");*/

        driver.get("https://www.google.com");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.loopcamp.io");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.amazon.com");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.facebook.com");

        System.out.println("driver.getTitle() = " + driver.getTitle());

        // iterate and go to one of them
        // Option 1
        // but its better to use utility to switch btw window

     /*   Set<String> windowHandles = driver.getWindowHandles();
        for (String window : windowHandles){
            driver.switchTo().window(window);

            // to stay at amazon page:
            if(driver.getTitle().contains("Amaz")) break;
        }
*/
        // Option 2
        BrowsersUtils.switchToWindow(driver, "Amaz");

    }

}
