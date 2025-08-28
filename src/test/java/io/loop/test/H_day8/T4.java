package io.loop.test.H_day8;

import io.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class T4  extends TestBase {
    @Test
    public void T4() throws InterruptedException {
        driver.get("https://app.docuport.app/company-formation/resident");

        //Validate the Registration Page
        WebElement regPage = driver.findElement(By.xpath("//*[contains(text(),' LLC Registration ')]"));
        String actualRegPage = regPage.getText();
        assertEquals(actualRegPage, "LLC Registration", "NO MATCH");

        //Validate Company Information page:
        WebElement compInfoPage = driver.findElement(By.xpath("//p[normalize-space()='Company Information']"));
        String actualCompInfoPage = compInfoPage.getText();
        assertEquals(actualCompInfoPage, "Company Information", "NO MATCH");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[contains(text(),'Virginia')]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//*[normalize-space(.)='Legal Company Name *']/following-sibling::input")).sendKeys("LLC Tourism USA");
        driver.findElement(By.xpath("//*[normalize-space(.)='Industry *']/following-sibling::input[@type='text']")).click();
        driver.findElement(By.xpath("//div[@class='v-list-item__title' and text()='Agents']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("(//div[contains(@class,'v-input')][.//label[normalize-space(.)='First name *']]//input[@type='text' and not(@type='hidden')])[1]")).sendKeys("John ");
        //driver.findElement(By.xpath("//label[text()='First name *']/following-sibling::input[1]")).sendKeys("John "); - it worked too
        driver.findElement(By.xpath("(//div[contains(@class,'v-input')][.//label[normalize-space(.)='Last name *']]//input[@type='text' and not(@type='hidden')])[1]")).sendKeys("Watson");
        driver.findElement(By.xpath("//div[@class='v-input__control'][.//label[normalize-space(.)='Email address *']]//input[@type='text']")).sendKeys("aaa12@gmaol.com");
        driver.findElement(By.xpath("(//div[@class='v-input__control'][.//label[normalize-space(.)='Phone number *']]//input[@type='text' and not(@type='hidden')])[1]")).sendKeys("+134890987445");
        WebElement nextButton = driver.findElement(By.xpath("(//button[@type='submit']//span[normalize-space(.)='Next' ])[1]"));
        nextButton.click();


        //Validate Registered Agent and Business Address page:
        WebElement regPage2 = driver.findElement(By.xpath("//p[contains(.,'Registered Agent')]"));
        String actualRegPage2 = regPage2.getText();
        assertEquals(actualRegPage2.trim(), "Registered Agent and Business Address", "NO MATCH");
        Thread.sleep(3000);

        WebElement agentType = driver.findElement(By.xpath("//label[text()='Company']"));
        agentType.click();
        driver.findElement(By.xpath("//label[text()='Company name *']/following-sibling::input")).sendKeys("Johson's baby");
        driver.findElement(By.xpath("//label[text()='Address line 1 *']/following-sibling::input")).sendKeys("12334 Test  streert");
        driver.findElement(By.xpath("//label[text()='City *']/following-sibling::input")).sendKeys("Fairfax");
        driver.findElement(By.xpath("//label[text()='Jurisdiction *']/following-sibling::input[1]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//div[@class='v-list-item__title' and text()='Alexandria']")).click();
        driver.findElement(By.xpath("//label[text()='Zip code *']/following-sibling::input")).sendKeys("234567");
        driver.findElement(By.xpath("//label[text()='Email address']/following-sibling::input")).sendKeys("324Test@test.com");
        driver.findElement(By.xpath("//form[@data-gtm-form-interact-id='1']//child::div//child::div[9]//child::div//child::div//child::div//child::div//child::input")).sendKeys("234564321345");
        driver.findElement(By.xpath("//label[text()='Use Registered Agent Address']")).click();
        driver.findElement(By.xpath("//div[@class='v-stepper__content ma-0 pa-0'][@style='transform-origin: center top 0px;']//div[@class='d-flex align-center justify-end']//child::button[2]//span")).click();

        //Validate Management Structure page:
        WebElement regPage3 = driver.findElement(By.xpath("//p[contains(.,'Management Structure')]"));
        String actualRegPage3 = regPage3.getText();
        assertEquals(actualRegPage3.trim(), "Management Structure", "NO MATCH");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//label[text()='Share Ownership (%) *']/../../../../../../child::div/child::div/child::div/child::div/child::div/child::input[1]")).sendKeys("Malvin");
        driver.findElement(By.xpath("//label[text()='Share Ownership (%) *']/../../../../../../child::div//following-sibling::div/child::div/child::div/child::div/child::div//input[1]")).sendKeys("Elvin");
        driver.findElement(By.xpath("//label[text()='Share Ownership (%) *']/../../../../../../child::div//following-sibling::div//following-sibling::div//following-sibling::div//child::div/child::div/child::div/child::div//input[1]")).sendKeys("25");
        driver.findElement(By.xpath("//label[text()='SSN of an Organizing Member *']//following-sibling::input")).sendKeys("123-12-3455");
        driver.findElement(By.xpath("//p[text()=' Social Security Number required to get Employment Identification Number (EIN) ']//..//label[text()='First name *']//following-sibling::input")).sendKeys("Tompson");
        driver.findElement(By.xpath("//p[text()=' Social Security Number required to get Employment Identification Number (EIN) ']//..//label[text()='Last name *']//following-sibling::input")).sendKeys("Milly");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//span[text()=' Go to payment ']")).click();

        //Validate Payment Info page:
        WebElement regPage4 = driver.findElement(By.xpath("//p[contains(.,' Payment Information ')]"));
        String actualRegPage4 = regPage4.getText();
        assertEquals(actualRegPage4.trim(), "Payment Information", "NO MATCH");


    }
}


/*
 extra task
 =============

 automate till payment
 https://app.docuport.app/company-formation/resident
 */