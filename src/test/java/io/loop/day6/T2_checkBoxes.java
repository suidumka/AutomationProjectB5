package io.loop.day6;

import io.loop.Utilities.GeneralConstants;
import io.loop.Utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class T2_checkBoxes {
    public static void main(String[] args) {
        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);
        driver.manage().window().maximize();

        driver.get("http://the-internet.herokuapp.com/checkboxes");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       // WebElement checkbox1 = driver.findElement(By.xpath("//input/following-sibling::text()[contains(.,'checkbox 1')]"));
        WebElement checkbox1 = driver.findElement(By.xpath("//input/following-sibling::text()[contains(.,'checkbox 1')]/preceding-sibling::input"));
        // here we selected the text next to checkbox, but since the text is not clickable->
        // we found an element of checkbox which is clickable with /preceding-sibling::input

        //input[@type='checkbox' and following-sibling::text()[contains(.,'checkbox 1')]] => option 2 for

        WebElement checkbox2 = driver.findElement(By.xpath("//input[@type='checkbox' and normalize-space(following-sibling::text())='checkbox 2']"));

        if (!checkbox1.isSelected()) {
            System.out.println("checkbox is NOT selected " );
        } else {
            System.out.println("checkbox1 is selected " );
        }

        checkbox1.click();

        if (!checkbox1.isSelected()) {
            System.out.println("checkbox is NOT selected " );
        } else {
            System.out.println("checkbox1 is selected " );
        }


    }
}
/*
        1. Go to http://the-internet.herokuapp.com/checkboxes
        2. Confirm checkbox #1 is NOT selected by default
        3. Confirm checkbox #2 is SELECTED by default.
        4. Click checkbox #1 to select it.
        5. Click checkbox #2 to deselect it.
        6. Confirm checkbox #1 is SELECTED.
        7. Confirm checkbox #2 is NOT selected.

         */