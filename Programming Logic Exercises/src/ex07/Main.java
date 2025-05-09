package ex07;

import java.util.Scanner;

class BooleanValues {
    public boolean getBoolean(String message, Scanner scanner) {
        while (true) {
            System.out.print(message);
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("T")) {
                return true;
            } else if (input.equalsIgnoreCase("F")) {
                return false;
            } else {
                System.out.println("Only T or F are allowed");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BooleanValues booleanValues = new BooleanValues();

        boolean value1 = booleanValues.getBoolean("Enter \"T\" for True or \"F\" for False(first value): ", scanner);
        boolean value2 = booleanValues.getBoolean("Enter \"T\" for True or \"F\" for False(second value): ", scanner);

        if (value1 && value2) {
            System.out.println("Both are TRUE");
        } else if (!value1 && !value2) {
            System.out.println("Both are FALSE");
        } else {
            System.out.println("The values are different");
        }
        scanner.close();
    }
}
