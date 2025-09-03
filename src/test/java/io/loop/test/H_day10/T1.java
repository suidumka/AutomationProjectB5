package io.loop.test.H_day10;

import io.loop.test.Utilities.Driver;
import org.testng.annotations.Test;

public class T1 {
    @Test
    public void test() {
        Driver.getDriver().get("https://loopcamp.vercel.app/drag-and-drop-circles.html");
    }
}
/*
task1
Open a chrome browser
Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
Click and hold small circle
Move it on top of the big circle
validate “Now drop…” text appears on big circ
 */