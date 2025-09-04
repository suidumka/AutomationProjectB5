package io.loop.test.H_day10;

import io.loop.pages.LoopPracticeDragDropPage;
import io.loop.test.Utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class T2 {

    LoopPracticeDragDropPage dragDropPage;
    Actions actions;

    @Test
    public void t2() throws InterruptedException {


        Driver.getDriver().get("https://loopcamp.vercel.app/drag-and-drop-circles.html");
        dragDropPage = new LoopPracticeDragDropPage();
        actions = new Actions(Driver.getDriver());

        String expected = "Try again!";
        actions.moveToElement(dragDropPage.smallCircle)
                .clickAndHold()
                .moveByOffset(100, 100)
                .release()
                .pause(3000)
                .perform();
        assertEquals(dragDropPage.bigCircle.getText(), expected, "No match");

        Driver.closeDriver();

    }

}
/*
task2
Open a chrome browser
Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
Click and hold small circle
Dropped anywhere outside of big circle
validate “Try again!” text appears on big circle
 */