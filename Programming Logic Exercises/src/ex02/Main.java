package ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Operation operation = new Operation();

        while (true) {
            System.out.print("Enter a number: ");
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();

                operation.evenOrOdd(input);
                operation.positiveOrNegative(input);

                break;
            } else {
                System.out.println("Invalid number!");
                scanner.next();
            }
        }
        scanner.close();
    }
}
