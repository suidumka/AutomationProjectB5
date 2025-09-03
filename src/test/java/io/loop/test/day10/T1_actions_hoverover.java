package io.loop.test.day10;

import io.loop.test.Utilities.ConfigurationReader;
import io.loop.test.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class T1_actions_hoverover {

    @Test
    public void google_actions_hoverover() throws InterruptedException {

        Driver.getDriver().get(ConfigurationReader.getProperties("google.url"));
        WebElement googleSearch = Driver.getDriver().findElement(By.xpath("//input[@id='gbqfbb']/preceding-sibling::input"));
        WebElement feelingLucky = Driver.getDriver().findElement(By.xpath("//input[@id='gbqfbb']"));
      /* extra - practice:
       WebElement googleSearchSelenium4 = Driver.getDriver().findElement(with(By.tagName("input")).straightLeftOf(feelingLucky));
        feelingLucky.click();
        googleSearchSelenium4.click();
        WebElement searchBox = Driver.getDriver().findElement(with(By.name("q")));
        searchBox.sendKeys("Loopcamp");
        googleSearchSelenium4.click();
*/
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(googleSearch).perform();
        Thread.sleep(3000);

        actions.moveToElement(feelingLucky).perform();
        actions.sendKeys("F12");


    }

}

/*

    1. Go to https://www.google.com
    2. Hover over on Search button
    3. Hover over on Feeling Lucky button
     */
