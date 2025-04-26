package ex03;

import java.util.Scanner;

public class Operation {
    Scanner scanner = new Scanner(System.in);

    public int numberCheck(String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                return number;
            } else {
                System.out.println("Invalid! must be a positive and integer number!");
                scanner.next();
            }
        }
    }

    public void conditional(int a, int b) {
        if (a == b) {
            int c = a + b;
            System.out.printf("The sum of %d and %d is %d", a, b, c);
        } else {
            int c = a * b;
            System.out.printf("The multiply of %d by %d is %d", a, b, c);
        }
    }
}