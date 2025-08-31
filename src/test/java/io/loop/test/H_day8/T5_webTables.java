package io.loop.test.H_day8;

import io.loop.test.Utilities.DocuportConstants;
import io.loop.test.Utilities.DocuportUtils;
import io.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class T5_webTables extends TestBase {

    @Test
    public void docuportPage() throws InterruptedException{
        DocuportUtils.login(driver, DocuportConstants.ADVISOR);


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Thread.sleep(3000);

        //2. go to users
        WebElement usersButton = driver.findElement(By.xpath("//span[contains(text(),'Users')]"));
        usersButton.click();

        //3. validate that full name for alex.de.souza@gmail.com is Alex De Souza
        String expectedFName = "AAlex De Souza";
        String actualFName = DocuportUtils.returnAnyFieldFromTable(driver, "alex.de.souza@gmail.com", "Full name");
        Assert.assertEquals(actualFName, expectedFName, "NO MATCH");

        String expectedUserName = "alexdesouze";
        String actualUserName = DocuportUtils.returnAnyFieldFromTable(driver, "alex.de.souza@gmail.com", "username");
        Assert.assertEquals(actualUserName, expectedUserName, "NO MATCH");

        String expectedPhoneNum = "+994512060042";
        String actualPhoneNum = DocuportUtils.returnAnyFieldFromTable(driver, "alex.de.souza@gmail.com", "phone number");
        Assert.assertEquals(actualPhoneNum, expectedPhoneNum, "NO MATCH");

        String expectedRole = "Client";
        String actualRole = DocuportUtils.returnAnyFieldFromTable(driver, "alex.de.souza@gmail.com", "role");
        Assert.assertEquals(actualRole, expectedRole, "NO MATCH");

        String expectedAdv = "advisor advisor";
        String actualAdv = DocuportUtils.returnAnyFieldFromTable(driver, "alex.de.souza@gmail.com", "advisor");
        Assert.assertEquals(actualAdv, expectedAdv, "NO MATCH");

       /* String expectedInviter = "inviter";
        String actualInviter = DocuportUtils.returnAnyFieldFromTable(driver, "alex.de.souza@gmail.com", "");
        Assert.assertEquals(actualInviter, expectedInviter, "NO MATCH");*/
    }
}
/*
    1. login as an advisor
    2. go to users
    3. validate that full name for alex.de.souza@gmail.com is Alex De Souza
    4. validate that user name for alex.de.souza@gmail.com is alexdesouze
    5. validate that phone number for alex.de.souza@gmail.com is +994512060042
    6. validate that role for alex.de.souza@gmail.com is client
    7. validate that advisor for alex.de.souza@gmail.com is  Batch1 Group1
     */
