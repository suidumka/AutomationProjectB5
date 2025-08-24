package io.loop.test.H_day07;

import io.loop.test.base.TestBase;
import org.testng.annotations.Test;

public class T3 extends TestBase {

    @Test
    public void iframeTask(){
        driver.get("https://demoqa.com/nestedframes");

    }
}
/*
task3
=============
go to https://demoqa.com/nestedframes
Validate "Child Iframe" text
Validate "Parent Iframe" text
Validate the "Sample Nested Iframe page. There are nested iframes in this page. Use browser inspecter or firebug to check out the HTML source. In total you can switch between the parent frame and the nested child frame."

 */