package io.loop.test.ZZZpractice;

import io.loop.test.Utilities.LoopcampConstants;
import io.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class loopList extends TestBase {

    @Test
    public void loopList(){
        driver.get(LoopcampConstants.RADIOBUTTON_URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        List <WebElement> list = driver.findElements(By.xpath("//input[@name='color']"));
        System.out.println(list.size());

        for (WebElement eachElem :list){
            System.out.println("Button's name: " + eachElem.getAttribute("id"));
            System.out.println("Is enabled: " + eachElem.isEnabled());
            System.out.println("Is selected: "+ eachElem.isSelected());
        }
    }
}
