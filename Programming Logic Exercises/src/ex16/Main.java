package ex16;
// equilateral: same side length
// isosceles: two sides with the same length
// scalene: three sides has different length

import java.util.Scanner;

class Validation {
    public static double input(String message, Scanner scanner) {
        while (true) {
            System.out.print(message);
            if (scanner.hasNextDouble()) {
                double input = scanner.nextDouble();
                scanner.nextLine();
                if (input > 0) {
                    return input;
                } else {
                    System.out.println("Must be a positive number");
                    scanner.nextLine();
                }
            } else {
                System.out.println("Must be a number");
                scanner.nextLine();
            }
        }
    }
}

class TriangleSides {
    public static String classifyTriangle(double side1, double side2, double side3) {

        if (side1 == side2 && side2 == side3) {
            return "equilateral triangle";
        }

        if (side1 == side2 || side2 == side3 || side1 == side3) {
            return "isosceles triangle";
        }
        return "scalene triangle";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double side1 = Validation.input("Enter the first side: ", scanner);
        double side2 = Validation.input("Enter second side: ", scanner);
        double side3 = Validation.input("Enter the thirt side: ", scanner);

        String triangleType = TriangleSides.classifyTriangle(side1, side2, side3);
        System.out.println("The triangle is a " + triangleType);

    }
}

