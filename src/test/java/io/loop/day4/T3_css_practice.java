package io.loop.day4;

import io.loop.Utilities.DocuportConstants;
import io.loop.Utilities.GeneralConstants;
import io.loop.Utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_css_practice {
    public static void main(String[] args) {
        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);
        driver.manage().window().maximize();
        driver.navigate().to(DocuportConstants.DOCUPORT_URL_TEST);

        // locate the element with css
        WebElement logo = driver.findElement(By.cssSelector("img[src='/img/logo.d7557277.svg']"));

        // get value of the attribute
       // String docuport = logo.getDomAttribute("alt"); // both methods are same (with DOM and without)
        String actualLogoDocuport = logo.getAttribute("alt");

        System.out.println("docuport = " + actualLogoDocuport);

        if (DocuportConstants.EXPECTED_LOGO_DOCUPORT.equalsIgnoreCase(actualLogoDocuport)){
            System.out.println("Expected logo: " + DocuportConstants.EXPECTED_LOGO_DOCUPORT + ", matches actual logo: " + actualLogoDocuport + "=> TEST PASS");
        }else {
            System.out.println("Expected logo: " + DocuportConstants.EXPECTED_LOGO_DOCUPORT + ", DOES NOT match actual logo: " + actualLogoDocuport + "=> TEST FAIL");

        }


    }
}

    /*
    go to docuport app
    identify docuport with css
    get value of the attribute
    validate if it is "Docuport"

    the rest is homework:
    locate:
    username
    password
    login
        with css
    login to docuport
    locate home icon of docuport after login or any other element after login
    validated that you logged in

     */
