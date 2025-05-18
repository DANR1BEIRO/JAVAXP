package ex22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getNumbers();
    }

    public static int getValidation(String message, Scanner scanner) {
        while (true) {
            System.out.print(message);
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                scanner.nextLine();
                return number;
            }
            System.out.println("Must be an integer!");
            scanner.nextLine();
        }
    }

    public static void getNumbers() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int number1 = getValidation("Enter the first number: ", scanner);
            int number2 = getValidation("Enter the second number: ", scanner);

            if (number2 == 0) {
                System.out.println("Can't divide by zero");
            } else {
                int quotient = number1 / number2;
                int remainder = number1 % number2;

                System.out.println("The quotient is: " + quotient + "\nThe remainder is: " + remainder);
            }

            System.out.print("Do you want to continue? Y/N: ");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("n")) {
                System.out.println("exiting program...");
                break;
            }
        }
        scanner.close();
    }
}