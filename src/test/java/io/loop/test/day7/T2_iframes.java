package io.loop.test.day7;

import io.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class T2_iframes extends TestBase {

    @Test
    public void iframe(){
        driver.get("https://loopcamp.vercel.app/iframe.html");
        driver.manage().window().maximize();

        //Option 1: Switch to iframe by index
       // driver.switchTo().frame(0); //by index

        // Option 2: Switch to iframe by name or id
        driver.switchTo().frame("mce_0_ifr");

     /*   Option 3: Switch to iframe by xpath
        WebElement iframe = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
        driver.switchTo().frame(iframe);

        WebElement someText = driver.findElement(By.xpath("//p[.='Your content goes here.']"));
        System.out.println("someText.getText() = " + someText.getText());*/


        //locating the textBox
        WebElement iframeBox = driver.findElement(By.xpath("//*[@id='tinymce']"));
        iframeBox.clear();
        iframeBox.sendKeys("Loopcamp");
        assertEquals(iframeBox.getText(), "Loopcamp", "NO Match");

        //switch back to main content, because the header is outside of the iframe. so we need to exit the frame with:
        driver.switchTo().defaultContent();

        WebElement header = driver.findElement(By.xpath("//h3[contains(text(),'An iFrame')]"));
        assertTrue(header.isDisplayed(), "Header is Not displayed"  );

    }

    @Test
    public void nestedFrame(){
        driver.get("https://loopcamp.vercel.app/nested-frames.html");
        // Find all frames
        List <WebElement> iframes;
        iframes = driver.findElements(By.xpath("//frame"));
        System.out.println("iframe size = " + iframes.size());
    }

}
/*
    1- Open a chrome browser
    2- Go to: https://loopcamp.vercel.app/iframe.html
    3- Clear text from comment body
    4- Type "Loop Academy" in comment body
    5- Verify "Loop Academy" text is written in comment body
    6- Verify header "An iFrame containing the TinyMCE WYSIWYG Editor" is displayed
     */