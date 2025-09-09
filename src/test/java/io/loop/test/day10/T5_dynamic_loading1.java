package io.loop.test.day10;

import io.loop.pages.LoopPracticeDynamicLoading1Page;
import io.loop.test.Utilities.BrowsersUtils;
import io.loop.test.Utilities.ConfigurationReader;
import io.loop.test.Utilities.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class T5_dynamic_loading1 {
    LoopPracticeDynamicLoading1Page loopPracticeDynamicLoading1Page;



    @BeforeMethod
    public void t5_synchronization() {
        loopPracticeDynamicLoading1Page = new LoopPracticeDynamicLoading1Page();

        Driver.getDriver().get(ConfigurationReader.getProperties("loop.practice"));
    }

    @AfterMethod
    public void tearDownMethod(){
        Driver.closeDriver();
    }

    @Test
    public void dynamic_loading1(){
        BrowsersUtils.loopLinkClickMethod("Dynamic Loading");
        BrowsersUtils.waitForClickable(loopPracticeDynamicLoading1Page.dynamicLoading1, 10).click();
        BrowsersUtils.waitForClickable(loopPracticeDynamicLoading1Page.startButton, 10).click();
        BrowsersUtils.waitForInvisibility(loopPracticeDynamicLoading1Page.loadingBar, 10);
        assertTrue(loopPracticeDynamicLoading1Page.userName.isDisplayed());

        loopPracticeDynamicLoading1Page.userName.sendKeys(ConfigurationReader.getProperties("dynamicLoading.username"));
        loopPracticeDynamicLoading1Page.password.sendKeys(ConfigurationReader.getProperties("dynamicLoading.incorrectPassword"));

        BrowsersUtils.waitForClickable(loopPracticeDynamicLoading1Page.submitButton, 10).click();
        assertTrue(BrowsersUtils.waitForVisibility(loopPracticeDynamicLoading1Page.errorMsg, 10).isDisplayed(), "NO MATCH");
    }

}
/*
    1. go to https://loopcamp.vercel.app/dynamic_loading/1.html
    2. click start
    3. wait loading bar disappears
    4. validate username is displayed
    5. enter username tomsmith
    6. enter password incorrectpassword
    7. click submit button
    8. validate "Your password is invalid!" is displayed
     */
