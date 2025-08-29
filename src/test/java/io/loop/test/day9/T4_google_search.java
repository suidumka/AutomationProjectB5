package io.loop.test.day9;

import io.loop.test.Utilities.ConfigurationReader;
import io.loop.test.Utilities.DocuportConstants;
import io.loop.test.Utilities.DocuportUtils;
import io.loop.test.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class T4_google_search {

    @Test
    public void google_search() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperties("google.url"));
        System.out.println("((RemoteWebDriver) driver).getSessionId() = " + ((RemoteWebDriver) Driver.getDriver()).getSessionId());
        WebElement searchBox = Driver.getDriver().findElement(By.name("q"));
        searchBox.sendKeys("Loop Academy " + Keys.ENTER);
        Thread.sleep(3000);
        String actualTitle = Driver.getDriver().getTitle();
        assertEquals(actualTitle, "Loop Academy - Google Search");
    }

    @Test
    public void docuport_search() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperties("docuportBETA"));
        System.out.println("((RemoteWebDriver) Driver.getDriver()).getSessionId() = " + ((RemoteWebDriver) Driver.getDriver()).getSessionId());

        DocuportUtils.login(Driver.getDriver(), DocuportConstants.ADVISOR);
        WebElement myUploads = Driver.getDriver().findElement(By.xpath("//span[contains(text(),'My uploads')]"));
        myUploads.click();
    }


}


