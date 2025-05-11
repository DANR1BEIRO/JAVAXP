package ex14;

import java.util.Scanner;

class Validation {
    public static int getValidation(String message, Scanner scanner) {
        while (true) {
            System.out.print(message);
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                scanner.nextLine();
                return input;
            } else {
                System.out.println("Must be a number!");
                scanner.nextLine();
            }
        }
    }
}

class SwapsVariableValues {
    public static void swapsVariableValues(int a, int b) {
        System.out.println("\nThe value of A before the swap is: " + a);
        System.out.println("The value of B before the swap is: " + b);
        int c = a;
        a = b;
        b = c;
        System.out.println("----------------------------------------");
        System.out.println("The value of A after the swap is: " + a);
        System.out.println("The value of B after the swap is: " + b);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Validation.getValidation("Enter the value of A: ", scanner);
        int b = Validation.getValidation("Enter the value of B: ", scanner);

        SwapsVariableValues.swapsVariableValues(a, b);
    }
}
