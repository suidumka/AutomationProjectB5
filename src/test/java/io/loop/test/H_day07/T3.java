package io.loop.test.H_day07;

import io.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.TreeMap;

import static org.testng.Assert.assertEquals;

public class T3 extends TestBase {

    @Test
    public void iframeTask() throws InterruptedException {
        driver.get("https://demoqa.com/nestedframes");

        /*  Option 1: Switch to iframe by xpath
        WebElement frame = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(frame);*/

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Option 2: Switch to iframe by name or id
        driver.switchTo().frame("frame1");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));

        //Validate "Child Iframe" text
        WebElement childFrame = driver.findElement(By.xpath("//p[normalize-space()='Child Iframe']"));
        String actualChild = childFrame.getText();
        assertEquals(actualChild.trim(), "Child Iframe", "No MATCH");

        //Validate "Parent Iframe" text
        driver.switchTo().parentFrame();

        WebElement parentFrame = driver.findElement(By.xpath("//body[contains(text(),'Parent frame')]"));
        String actualParent = parentFrame.getText();
        assertEquals(actualParent.trim(), "Parent frame", "No Match");






    }
}
/*
task3
=============
go to https://demoqa.com/nestedframes
Validate "Child Iframe" text
Validate "Parent Iframe" text
Validate the "Sample Nested Iframe page. There are nested iframes in this page.
Use browser inspecter or firebug to check out the HTML source.
In total you can switch between the parent frame and the nested child frame."

 */