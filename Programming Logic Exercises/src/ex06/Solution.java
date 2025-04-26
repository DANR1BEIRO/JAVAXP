package ex06;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                System.out.print("Enter a number: ");
                if (scanner.hasNextDouble()) {
                    double number = scanner.nextDouble();

                    if (number > 0) {
                        double adjustment = number * 0.05;
                        double result = number + adjustment;
                        System.out.println("The number with a 5% adjustment is: " + result);
                        break;
                    } else {
                        System.out.println("number must be positive");
                    }
                } else {
                    System.out.println("Invalid number");
                    scanner.next();
                }
            }
        } finally {
            scanner.close();
        }
    }
}

