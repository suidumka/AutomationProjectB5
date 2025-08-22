package io.loop.test.H_day02;

import io.loop.test.Utilities.GeneralConstants;
import io.loop.test.Utilities.WebDriverUtil;
import org.openqa.selenium.WebDriver;

public class t4 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);
        driver.manage().window().maximize();

        //input login to docuport application
      //  driver.get(DocuportConstants.DOCUPORT_TEST);
    }
}
