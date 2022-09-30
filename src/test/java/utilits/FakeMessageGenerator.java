package utilits;

import com.github.javafaker.Faker;

public class FakeMessageGenerator {

    public static int generateTag() {
        return new Faker().number().numberBetween(0, 10);
    }

    public static String generateFirstName() {
        return new Faker().name().firstName();
    }

    public static String generateLastNameInitial() {
        return String.valueOf(new Faker().lorem().character());
    }
}
