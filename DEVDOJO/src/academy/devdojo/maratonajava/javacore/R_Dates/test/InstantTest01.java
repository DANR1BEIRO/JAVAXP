package academy.devdojo.maratonajava.javacore.R_Dates.test;

import java.time.Instant;

public class InstantTest01 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);
        System.out.println(now.getNano());
        System.out.println(now.getEpochSecond());
    }
}
