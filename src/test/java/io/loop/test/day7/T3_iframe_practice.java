package io.loop.test.day7;

import io.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class T3_iframe_practice extends TestBase {

    /*
    go to https://loopcamp.vercel.app/nested-frames.html
    validate "LEFT", "MIDDLE", "RIGHT", "BOTTOM"
    */

    @Test
    public void iframeValidation(){
        driver.get("https://loopcamp.vercel.app/nested-frames.html");

        // in this html we have 2 main iframes, 1 frame contains: left/middle/right. and 2nd frame is seperate frame

        // validate LEFT. There is a nested iframe. we need to switch first the outter one and next inner one
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");

        WebElement left = driver.findElement(By.xpath("//*[contains(text(),'LEFT')]"));
        String actualLeft = left.getText();
        assertEquals(actualLeft.trim(), "LEFT", "Left text does not match");

        // coming back to outter frame
        driver.switchTo().parentFrame();

        // validate MIDDLE
        driver.switchTo().frame("frame-middle");

        WebElement middle = driver.findElement(By.xpath("//*[contains(text(),'MIDDLE')]"));
        String actualMiddle = middle.getText();
        assertEquals(actualMiddle.trim(), "MIDDLE", "Middle text does not match");

        // coming back to outter frame
        driver.switchTo().parentFrame();

        // validate RIGHT
        driver.switchTo().frame("frame-right");
        WebElement right = driver.findElement(By.xpath("//*[contains(text(),'RIGHT')]"));
        String actualRight = right.getText();
        assertEquals(actualRight.trim(), "RIGHT", "Right text does not match");

        // bottom frame is seperate from outter iframe, so we need to go back to html
        driver.switchTo().defaultContent();

        // validate BOTTOM
        driver.switchTo().frame("frame-bottom");
        WebElement bottom = driver.findElement(By.xpath("//*[contains(text(),'BOTTOM')]"));
        String actualBottom = bottom.getText();
        assertEquals(actualBottom.trim(), "BOTTOM", "Bottom text does not match");
    }
}