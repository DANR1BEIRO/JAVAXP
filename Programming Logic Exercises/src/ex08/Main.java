package ex08;

import java.util.Arrays;
import java.util.Scanner;

class IntegerInput {
    public int getInteger(String message, Scanner scanner) {
        while (true) {
            System.out.printf(message);
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                scanner.nextLine();
                return input;
            } else {
                System.out.println("Must be an integer");
                scanner.nextLine();
            }
        }
    }
}

class DecendingArray {
    public String decending(int a, int b, int c) {
        int[] array = {a, b, c};
        Arrays.sort(array);
        return ("Decending order: " + array[2] + ", " + array[1] + ", " + array[0] + ".");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntegerInput integerInput = new IntegerInput();
        DecendingArray decendingArray = new DecendingArray();

        int value1 = integerInput.getInteger("Enter the first value: ", scanner);
        int value2 = integerInput.getInteger("Enter the second value: ", scanner);
        int value3 = integerInput.getInteger("Enter the third value: ", scanner);

        System.out.println(decendingArray.decending(value1, value2, value3));

        scanner.close();
    }
}
