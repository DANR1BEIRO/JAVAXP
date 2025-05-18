package ex23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double hoursPerClass = getDouble("Number of hours per class: ", scanner);
        double valuePerHour = getDouble("Value per hour/class: R$", scanner);
        int classesPerMonth = getInt("Number of classes per month: ", scanner);
        double grossSalary = classesPerMonth * hoursPerClass * valuePerHour;
        double inssDiscountPercent = getDouble("INSS discount: ", scanner);
        printNetSalary(grossSalary, inssDiscountPercent);
    }

    public static int getInt(String message, Scanner scanner) {
        while (true) {
            System.out.print(message);
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                scanner.nextLine();
                if (number <= 0) {
                    System.out.println("must be greater than zero.");
                    continue;
                }
                return number;
            }
            System.out.println("Only numbers are allowed");
            scanner.nextLine();
        }
    }

    public static double getDouble(String message, Scanner scanner) {
        while (true) {
            System.out.print(message);
            if (scanner.hasNextDouble()) {
                double number = scanner.nextDouble();
                scanner.nextLine();
                if (number <= 0) {
                    System.out.println("must be greater than zero.");
                    continue;
                }
                return number;
            }
            System.out.println("Only numbers values are allowed ");
            scanner.nextLine();
        }
    }

    public static void printNetSalary(double grossSalary, double inssDiscountPercent) {
        double discount = (inssDiscountPercent / 100.0) * grossSalary;
        System.out.println("Gross monthly salary: R$" + grossSalary);
        System.out.println("INSS discount (" + inssDiscountPercent + "%): R$" + discount);
        System.out.println("Net salary: R$" + (grossSalary - discount));
    }
}