package io.loop.test.base;

import io.loop.test.Utilities.ConfigurationReader;
import io.loop.test.Utilities.GeneralConstants;
import io.loop.test.Utilities.WebDriverUtil;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    public WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        //driver = WebDriverUtil.getDriver(GeneralConstants.CHROME); // we created a config property
        driver = WebDriverUtil.getDriver(ConfigurationReader.getProperties("browser"));
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDropDown() throws InterruptedException {
        Thread.sleep(3000);
       driver.quit();

    }


}
