package io.loop.test.day10;

import io.loop.pages.LoopPracticeDynamicLoading7Page;
import io.loop.test.Utilities.BrowsersUtils;
import io.loop.test.Utilities.ConfigurationReader;
import io.loop.test.Utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import static org.testng.Assert.assertTrue;

public class T6_explicit_wait {

    LoopPracticeDynamicLoading7Page loopPracticeDynamicLoading7Page;
    WebDriverWait wait;

    @BeforeMethod
    public void setUpMethod() {
        loopPracticeDynamicLoading7Page = new LoopPracticeDynamicLoading7Page();
        Driver.getDriver().get(ConfigurationReader.getProperties("loop.practice"));
    }

    @AfterMethod
    public void tearDownMethod() {
        Driver.closeDriver();
    }

    @Test
    public void explicit_wait_test() {
        BrowsersUtils.loopLinkClickMethod("Dynamic Loading");
        loopPracticeDynamicLoading7Page.getDynamicLoading7.click();
        wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleIs("Dynamic title"));
        assertTrue(loopPracticeDynamicLoading7Page.doneMsg.isDisplayed(), "No element is displayed");
        assertTrue(loopPracticeDynamicLoading7Page.image.isDisplayed(), "No image is displayed");

    }


}
   /*
       1. go https://loopcamp.vercel.app/dynamic_loading/7.html
       2. Wait until title is “Dynamic title”
       3. Assert: Message “Done!” is displayed.
       4. Assert: Image is displayed.
     */