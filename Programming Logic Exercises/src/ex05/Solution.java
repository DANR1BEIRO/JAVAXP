package ex05;

import java.util.Scanner;

public class Solution {
    private final Scanner scanner;
    private static final double MINIMUM_WAGE = 1293.2;

    public Solution(Scanner scanner) {
        this.scanner = scanner;
    }

    public double readSalary() {
        while (true) {
            System.out.print("Salary amount: R$");
            if (scanner.hasNextDouble()) {
                double salary = scanner.nextDouble();
                if (salary > 0) {
                    return salary;
                } else {
                    System.out.println("Salary must be a positive number");
                }
            } else {
                System.out.println("Must be a float number");
                scanner.next();
            }
        }
    }

    public double calculateMinimumWages(double salary) {
        return salary / MINIMUM_WAGE;
    }

    public void displayResult(double howManyMinimum) {
        System.out.printf("You earn %.2f minimum wages", howManyMinimum);
    }

    public void howManyMinimumUserEarns() {
        double salary = readSalary();
        double howManyMinimum = calculateMinimumWages(salary);
        displayResult(howManyMinimum);
    }
}
