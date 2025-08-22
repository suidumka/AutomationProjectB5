package io.loop.test.day6;

import io.loop.test.Utilities.DocuportConstants;
import io.loop.test.Utilities.GeneralConstants;
import io.loop.test.Utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T8_HTML_dropdown {
    WebDriver driver;
    String actual;
    String expected;

    @BeforeMethod
    public void setUpMethod(){
        driver= WebDriverUtil.getDriver(GeneralConstants.CHROME);
        driver.manage().window().maximize();
        driver.get(DocuportConstants.DOCUPORT_URL_TEST);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
       // Thread.sleep(3000);
        //driver.quit();
    }

    @Test
    public void htmlDropdown() throws InterruptedException {
        WebElement userName = driver.findElement(By.xpath("//input[@id='input-14']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='input-15']"));

        userName.sendKeys(DocuportConstants.USERNAME_CLIENT);
        password.sendKeys(DocuportConstants.PASSWORD_FOR_LOGIN);

        WebElement signInButton = driver.findElement(By.className("v-btn__content"));
        signInButton.click();

        WebElement dropdown = driver.findElement(By.xpath("//input[@type='text']"));
        dropdown.click();

        Thread.sleep(3000);

        WebElement findNameInDropdown = driver.findElement(By.xpath("//span[contains(text(),'TomJerry4 ')]"));
        findNameInDropdown.click();




    }


}
