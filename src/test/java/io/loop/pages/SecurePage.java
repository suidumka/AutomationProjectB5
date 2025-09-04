package io.loop.pages;

import io.loop.test.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecurePage {

    public SecurePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    };

    @FindBy (xpath = "//input[@name='ctl00$MainContent$username']")
    public WebElement userName;

    @FindBy (xpath = "//input[@name='ctl00$MainContent$password']")
    public WebElement password;

    @FindBy (xpath = "//input[@name='ctl00$MainContent$login_button']")
    public WebElement loginButton;

}
