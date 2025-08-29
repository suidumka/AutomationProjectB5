package io.loop.test.day9;


import io.loop.test.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class T6_uploads {
    @Test
    public void upload_file(){
        Driver.getDriver().navigate().to("http://demo.guru99.com/test/upload");
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        WebElement chooseFile = Driver.getDriver().findElement(By.xpath("//input[@type='file']"));
        String path = "/Users/suidum/Desktop/test";
        chooseFile.sendKeys(path);

        WebElement checkbox = Driver.getDriver().findElement(By.xpath("//input[@type='checkbox']"));
        checkbox.click();

        WebElement submitButton = Driver.getDriver().findElement(By.xpath("//button[@id='submitbutton']"));
        submitButton.click();

        String expected = "1 file\nhas been successfully uploaded.";
       String successMSG = Driver.getDriver().findElement(By.xpath("//h3[@id='res']")).getText();
       assertEquals(expected, successMSG, "No match");



    }
}
/*
    1. Go to “http://demo.guru99.com/test/upload”
    2. Upload file into Choose File
    3. Click terms of service check box
    4. Click Submit File button
    5. Validate expected message appeared. Expected: “1 file has been successfully uploaded.

    /Users/suidum/Desktop/test
    */