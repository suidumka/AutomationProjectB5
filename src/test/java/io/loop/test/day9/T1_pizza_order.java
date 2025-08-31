package io.loop.test.day9;

import io.loop.test.Utilities.PizzaOrderWebTableUtil;
import io.loop.test.base.TestBase;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class T1_pizza_order extends TestBase {
    @Test
    public void pizza_order() {

      driver.get("https://loopcamp.vercel.app/web-tables.html");
      actual = "Robert Baratheon";
      expected = "Hawaiian";
      String actualPizzaType = PizzaOrderWebTableUtil.returnFieldValue(driver, actual, "pizza Type");
        System.out.println("actualPizzaType = " + actualPizzaType);
        assertEquals(actualPizzaType, expected, "Pizza Type is not correct");


    }
}
