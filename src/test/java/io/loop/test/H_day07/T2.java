package io.loop.test.H_day07;

import io.loop.test.Utilities.Driver;
import io.loop.test.base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class T2  extends TestBase {

    @Test
    public void alertTask() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement alertButton = driver.findElement(By.xpath("//button[@id='alertButton']"));
        alertButton.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();

        Thread.sleep(3000);

        WebElement timeAlertButton = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
        timeAlertButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(6000);
        alert.accept();




    }

    @Test
    public void confirmButton() throws InterruptedException{
        driver.get("https://demoqa.com/alerts");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //click ok and validate - You selected Ok
        WebElement confirmButton = driver.findElement(By.xpath("//button[@id='confirmButton']"));
        confirmButton.click();
        driver.switchTo().alert().accept();

        String expectedConfirmButton = driver.findElement(By.id("confirmResult")).getText().replace("\n", " ");
        String actualConfirmButton = "You selected Ok";

        assertEquals(actualConfirmButton,expectedConfirmButton, "Actual does NOT match with expected");

        //after that do it again this time cancel and validate - You selected Cancel

        confirmButton.click();
        driver.switchTo().alert().dismiss();

        String expectedConfirmButtonCancel = driver.findElement(By.id("confirmResult")).getText().replace("\n", " ");
        String actualConfirmButtonCancel = "You selected Cancel";

        assertEquals(actualConfirmButtonCancel, expectedConfirmButtonCancel, "Actual does NOT match with expected");

    }

    @Test
    public void promptBox(){

        driver.get("https://demoqa.com/alerts");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        //enter "Loop Academy" and validate You entered Loop Academy

        WebElement buttonClick = driver.findElement(By.xpath("//button[@id='promtButton']"));
        buttonClick.click();

        String text = "Loop Academy";

        driver.switchTo().alert().sendKeys(text);
        driver.switchTo().alert().accept();

        String expected = driver.findElement(By.id("promptResult")).getText().replace("\n"," ");
        String actual = "You entered " + text;
        assertEquals(actual, expected, "No match");



    }
}
/*
task2
=============
go to https://demoqa.com/alerts
click - click button to see alert
handle alert
click - On button click, alert will appear after 5 seconds
handle alert
click - On button click, confirm box will appear
click ok and validate - You selected Ok
after that do it again this time cancel and validate - You selected Cancel
click - On button click, prompt box will appear
enter "Loop Academy" and validate You entered Loop Academy
 */