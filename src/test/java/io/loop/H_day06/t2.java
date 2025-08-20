package io.loop.H_day06;

 import io.loop.Utilities.DocuportConstants;
 import io.loop.Utilities.GeneralConstants;
 import io.loop.Utilities.WebDriverUtil;
 import org.openqa.selenium.By;
 import org.openqa.selenium.Keys;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.WebElement;
 import org.testng.annotations.AfterMethod;
 import org.testng.annotations.BeforeMethod;
 import org.testng.annotations.Test;

 import java.time.Duration;


public class t2 {

    WebDriver driver;
    String actual;
    String expected;

    @BeforeMethod
    public void setUpMethod(){
    driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);
    driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDropDown() throws InterruptedException {
    Thread.sleep(3000);
    driver.quit();
    }

    @Test
    public void docuportDropdown() throws InterruptedException {
        driver.get(DocuportConstants.DOCUPORT_URL_TEST);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement username = driver.findElement(By.xpath("//input[@id='input-14']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='input-15']"));
        username.sendKeys(DocuportConstants.USERNAME_ADVISOR);
        password.sendKeys(DocuportConstants.PASSWORD_FOR_LOGIN);

        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

        WebElement receivedDocsButton = driver.findElement(By.xpath("//a[@href='/received-docs' and @class='doc-card style-1']"));
        receivedDocsButton.click();

        Thread.sleep(3000);

        WebElement searchButton = driver.findElement(By.xpath("//span[@class='subtitle-2 text-none' and text()='Search']"));
        searchButton.click();


        WebElement statusDropdown = driver.findElement(By.xpath("//label[.='Status']"));
        statusDropdown.click();

        Thread.sleep(3000);

        WebElement inprogressButton = driver.findElement(By.xpath("//div[@class='v-list-item__title' and text()='In progress']"));
        inprogressButton.click();



    }


}
