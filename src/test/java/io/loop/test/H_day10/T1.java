package io.loop.test.H_day10;

import io.loop.pages.LoopPracticeDragDropPage;
import io.loop.test.Utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class T1 {
    LoopPracticeDragDropPage dragDropPage;
    Actions actions;

    @Test
    public void test() throws InterruptedException {
        Driver.getDriver().get("https://loopcamp.vercel.app/drag-and-drop-circles.html");
        dragDropPage = new LoopPracticeDragDropPage();
        actions = new Actions(Driver.getDriver());

        String expected  = "Now drop...";
        actions.moveToElement(dragDropPage.smallCircle)
                .clickAndHold()
                .moveByOffset(0, -200)
                .perform();
        assertEquals(dragDropPage.bigCircle.getText(), expected, "No match");

        Driver.closeDriver();

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