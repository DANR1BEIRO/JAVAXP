package ex09;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Weight {
    public double getWeight(String message, Scanner scanner) {
        while (true) {
            System.out.printf(message);
            if (scanner.hasNextDouble()) {
                double input = scanner.nextDouble();
                scanner.nextLine();
                return input;
            } else {
                System.out.println("weight must be a number");
                scanner.nextLine();
            }
        }
    }
}

class Height {
    public double getHeight(String message, Scanner scanner) {
        while (true) {
            System.out.printf(message);
            if (scanner.hasNextDouble()) {
                double input = scanner.nextDouble();
                scanner.nextLine();
                return input;
            } else {
                System.out.println("Height must be a number");
                scanner.nextLine();
            }
        }
    }
}

class BMIcalculator {
    public double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }
}

class BMI {
    String name;
    double min;
    double max;

    public BMI(String name, double min, double max) {
        this.name = name;
        this.min = min;
        this.max = max;
    }

    boolean isInRange(double bmi) {
        return bmi >= min && bmi <= max;
    }
}

class BMICategory {
    private static final List<BMI> BMI_CATEGORIES = Arrays.asList(
            new BMI("Underweight", 0, 18),
            new BMI("Optimal", 18.1, 24.9),
            new BMI("Overweight", 25, 29.9),
            new BMI("Obese", 30, Double.POSITIVE_INFINITY)
    );

    public static String getBmiCategory(double bmi) {
        for (BMI category : BMI_CATEGORIES) {
            if (category.isInRange(bmi)) {
                return category.name;
            }
        }
        return "Unknown";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Weight weightObj = new Weight();
        Height heightObj = new Height();
        BMIcalculator bmIcalculator = new BMIcalculator();

        double weight = weightObj.getWeight("Enter your weight(kg): ", scanner);
        double height = heightObj.getHeight("Enter your height(m): ", scanner);
        double bmi = bmIcalculator.calculateBMI(weight, height);
        String category = BMICategory.getBmiCategory(bmi);

        System.out.printf("Your BMI is %.2f", bmi);
        System.out.println("\nYou're classified as " + category);

        scanner.close();
    }
}





