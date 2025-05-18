package ex21;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        randomNumber();

    }

    public static void randomNumber() {
        int min = 0;
        int max = 100;
        int randomNumber = ThreadLocalRandom.current().nextInt(min, max + 1);
        System.out.println("The random number between 0 and 100 is: " + randomNumber);
    }
}
