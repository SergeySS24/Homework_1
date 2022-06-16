package com.docs;

import static com.utils.RandomUtils.*;

public class RandomUtilsExamples {
    public static void main(String[] args) {
        System.out.println("Random string of 10 letters: " + getRandomString(10));
        System.out.println("Random int between 1234 and 9999: " + getRandomInt(1234, 9999));
        System.out.println("Random email: " + getRandomEmail());
    }
}
