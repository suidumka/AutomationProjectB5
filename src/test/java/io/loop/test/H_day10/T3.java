package io.loop.test.H_day10;

import io.loop.pages.SecurePage;
import io.loop.test.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class T3 {

    SecurePage securePage;


    @Test
    public void t3() {
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        securePage = new SecurePage();

        securePage.userName.sendKeys("Tester");
        securePage.password.sendKeys("test");
        securePage.loginButton.click();

        List<WebElement> links = Driver.getDriver().findElements(By.xpath("//a"));
        System.out.println("links.size() = " + links.size());

        for (WebElement link : links) {
            String text = link.getText();
            if(text.isEmpty() || text.isBlank()) {
                text = "No text found";
            }else {
                System.out.println( text);
            }
        }

    }
}
/*
task3
Open browser
Go to website: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
Enter username: “Tester”
Enter password: “test”
Click to Login button
Print out count of all the links on landing page
Print out each link text on this page
 */