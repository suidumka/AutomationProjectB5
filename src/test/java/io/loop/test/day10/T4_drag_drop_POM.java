package io.loop.test.day10;

import io.loop.pages.LoopPracticeDragDropPage;
import io.loop.test.Utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class T4_drag_drop_POM {

    LoopPracticeDragDropPage dragDropPage;
    Actions actions;

    @BeforeMethod
    public void setUpMethod(){
        Driver.getDriver().get("https://loopcamp.vercel.app/drag-and-drop-circles.html");
        dragDropPage = new LoopPracticeDragDropPage();
        actions = new Actions(Driver.getDriver());
    }

    @AfterMethod
    public void tearDownMethod(){
        Driver.closeDriver();
    }

    @Test
    public void drag_small_here_test(){
        String expected = "Drag the small circle here.";
        String actual = dragDropPage.bigCircle.getText();
        assertEquals(actual, expected, "NO MATCH");
    }

    @Test
    public void dropHere(){
        actions.moveToElement(dragDropPage.smallCircle)
                .clickAndHold()
                .moveByOffset(100,100)
                .pause(3000)
                .release()
                .perform();

        assertEquals(dragDropPage.bigCircle.getText(), "Drop here.", "NO MATCH");
    }

    @Test
    public void dropHereTest(){
        actions.moveToElement(dragDropPage.smallCircle)
                .clickAndHold()
                .moveByOffset(0,-200)
                .pause(3000)
                .perform();

        assertEquals(dragDropPage.bigCircle.getText(), "Now drop...", "NO MATCH");

    }

    @Test
    public void dropSmallCircleSomewhereElse(){
        actions.moveToElement(dragDropPage.smallCircle)
                .clickAndHold()
                .moveByOffset(100, 100)
                .pause(2000)
                .release()
                .pause(2000)
                .perform();
        assertEquals(dragDropPage.bigCircle.getText(), "Try again!", "NO MATCH");
    }



}
/*
    Loop Practice Drag and Drop Test
    1. Open a chrome browser
    2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
    3. validate expected default text appears on big circle
    Expected = "Drag the small circle here."

    Loop Practice Drag and Drop Test
    1. Open a chrome browser
    2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
    3. Click and hold small circle
    4. validate "Drop here." text appears on big circle

    1. Open a chrome browser
    2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
    3. Click and hold small circle
    4. Move it on top of the big circle
    5. validate “Now drop…” text appears on big circ

    1. Open a chrome browser
    2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
    3. Click and hold small circle
    4. Dropped anywhere outside of big circle
    5. validate “Try again!” text appears on big circle
     */