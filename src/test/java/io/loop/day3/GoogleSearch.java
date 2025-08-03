package io.loop.day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
    public static void main(String[] args) {
        /*
         * Navigate to Google search
         * maximize the page
         * get title of the page
         * get url of the page
         * validate the title, expected title is "Google"
         * validate the url of the page, expected url is "https://www.google.com/"
         * close the browser
         * */

        // in selenium 3 we had to set up the driver, for that we need webdrivermanager libraries
        // WebDriverManager.chromedriver().setup();


        // create the driver object
        WebDriver driver1 = new ChromeDriver();
        driver1.navigate().to("https://www.google.com");

       driver1.manage().window().maximize();  // navigate to google  // driver.get()

       String expectedTitle = "Google"; // expected

       String actualTitle = driver1.getTitle(); //actual title

       // validation
       if (actualTitle.contains(expectedTitle)){
           System.out.println("Actual title " + actualTitle + " matches expected title:  " + expectedTitle + ". => TEST PASS");
       }else {
           System.err.println("Actual title " + actualTitle + " DOES NOT match expected title:  " + expectedTitle + ". => TEST FAIL");
       }


       String expectedURL = "https://www.google.com";

       String actualURL = driver1.getCurrentUrl();

       if(actualURL.contains(expectedURL)){
           System.out.println("Actual URL " + actualURL + " matches expected URL:  " + expectedURL + ". => TEST PASS");
       }else {
           System.out.println("Actual URL " + actualURL + " DOES NOT match expected URL:  " + expectedURL + ". => TEST FAIL");
       }

    }
}
