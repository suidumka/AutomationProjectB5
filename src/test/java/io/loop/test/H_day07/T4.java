package io.loop.test.H_day07;

import io.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class T4  extends TestBase {

    @Test
    public void frameTask4 (){
        driver.get("https://loopcamp.vercel.app/nested-frames.html");
        driver.manage().window().maximize();

        driver.switchTo().frame("frame-top");

        //LEFT
        driver.switchTo().frame("frame-left");
        WebElement leftFrame = driver.findElement(By.xpath("//*[contains(text(),'LEFT')]"));
        String actualLeftFrame = leftFrame.getText();
        assertEquals(actualLeftFrame, "LEFT", "NO MATCH");

        // back to parent frame
        driver.switchTo().parentFrame();
        //MIDDLE
        driver.switchTo().frame("frame-middle");
        WebElement middleFrame = driver.findElement(By.xpath("//*[contains(text(),'MIDDLE')]"));
        String actualMiddleFrame = middleFrame.getText();
        assertEquals(actualMiddleFrame, "MIDDLE", "NO MATCH");

        driver.switchTo().parentFrame();
        //RIGHT
        driver.switchTo().frame("frame-right");
        WebElement rightFrame = driver.findElement(By.xpath("//*[contains(text(),'RIGHT')]"));
        String actualRightFrame = rightFrame.getText();
        assertEquals(actualRightFrame, "RIGHT", "NO MATCH");

        driver.switchTo().defaultContent();
        //BOTTOM
        driver.switchTo().frame("frame-bottom");
        WebElement bottomFrame = driver.findElement(By.xpath("//*[contains(text(),'BOTTOM')]"));
        String actualBottomFrame = bottomFrame.getText();
        assertEquals(actualBottomFrame, "BOTTOM", "NO MATCH");




    }

}
/*
task4
=============
go to https://loopcamp.vercel.app/nested-frames.html
validate "LEFT", "MIDDLE", "RIGHT", "BOTTOM"
 */