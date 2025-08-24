package io.loop.test.H_day07;

import io.loop.test.Utilities.DocuportConstants;
import io.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.List;

public class T1 extends TestBase {
    @Test
    public void docuportDropdown() throws InterruptedException {

        driver.get(DocuportConstants.DOCUPORT_URL_TEST);
        driver.manage().window().maximize();

        //login as an advisor
        WebElement username = driver.findElement(By.xpath("//input[@id='input-14']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='input-15']"));
        username.sendKeys(DocuportConstants.USERNAME_ADVISOR);
        password.sendKeys(DocuportConstants.PASSWORD_FOR_LOGIN);

        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //go to received document
        WebElement receivedDocsButton = driver.findElement(By.xpath("//a[@href='/received-docs' and @class='doc-card style-1']"));
        receivedDocsButton.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //click search
        WebElement searchButton = driver.findElement(By.xpath("//span[@class='subtitle-2 text-none' and text()='Search']"));
        searchButton.click();

        WebElement statusDropdown = driver.findElement(By.xpath("//div[normalize-space(text())='All']"));
        statusDropdown.click();

        List< WebElement> statusDropdownOptions  = driver.findElements(By.xpath("//div[@role='listbox' and @id='list-309']"));

        statusDropdownOptions.forEach(WebElement::click);

        //validate that status dropdown does not allow to select multiple

        int counter = driver.findElements(By.xpath("//div[@role='listbox']//div[@role='option' and @aria-selected='true']")).size();

        if (counter == 1 ){
            System.out.println("Status dropdown: does NOT allow to select multiple options");
        }else {
            System.out.println("Status dropdown: allows select multiple options");
        }



        //validate that tags dropdown allows to select multiple

        WebElement clear = driver.findElement(By.xpath("//span[normalize-space()='Clear']"));
        clear.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        WebElement tagsDropdown = driver.findElement(By.xpath("//label[.='Tags']/parent::div"));
        tagsDropdown.click();

       // List <WebElement> tagsDropdownOptions = driver.findElements(By.xpath("//input[@id='input-134']/parent::div"));
        List <WebElement> tagsDropdownOptions = driver.findElements(By.xpath("//label[.='Tags']/parent::div"));
        tagsDropdownOptions.forEach(WebElement::click);



    }
}
/*
task1
=============
login as an advisor
go to received document
click search
validate that status dropdown does not allow to select multiple
validate that tags dropdown allows to select multiple

 */

 /*     WebElement statusDropdown = driver.findElement(By.xpath("//label[contains(text(),'Status')]"));
        statusDropdown.click();

        WebElement option1 = driver.findElement(By.xpath("//div[normalize-space(text())='In progress']"));
        option1.click();

        WebElement option2 = driver.findElement(By.xpath("//div[normalize-space(text())='Open']"));
        option2.click();

        WebElement option3 = driver.findElement(By.xpath("//div[normalize-space(text())='Done']"));
        option3.click();

        WebElement option4 = driver.findElement(By.xpath("//div[normalize-space(text())='All']"));
        option4.click();*/