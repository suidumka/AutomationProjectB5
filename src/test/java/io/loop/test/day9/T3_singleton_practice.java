package io.loop.test.day9;

import io.loop.test.base.TestBase;
import org.testng.annotations.Test;

public class T3_singleton_practice {
    @Test
    public void singleton_practice() {
        String str1 = T2_singleton_pattern_example.getWord();
        System.out.println(str1);

        String str2 = T2_singleton_pattern_example.getWord();
        System.out.println(str2);
    }
}
