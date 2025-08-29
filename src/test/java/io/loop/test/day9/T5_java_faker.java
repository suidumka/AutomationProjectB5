package io.loop.test.day9;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class T5_java_faker {
    @Test
    public void java_faker() throws InterruptedException {

        Faker faker = new Faker();
        System.out.println("faker.name().fullName() = " + faker.name().fullName());
        System.out.println(faker.numerify("204-###-####"));
        System.out.println(faker.letterify("??????????????"));
        System.out.println(faker.bothify("??###????###"));
        System.out.println(faker.address().fullAddress());
        System.out.println(faker.chuckNorris().fact());


    }
}
