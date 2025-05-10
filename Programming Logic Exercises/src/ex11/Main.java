package ex11;

import java.util.Scanner;

class Validation {
    public static double getValidation(String message, Scanner scanner) {
        while (true) {
            System.out.print(message);
            if (scanner.hasNextInt()) {
                double input = scanner.nextDouble();
                scanner.nextLine();
                return input;
            } else {
                System.out.println("Must be a number!");
                scanner.nextLine();
            }
        }
    }
}

class Average {
    public static double averageCalculator(double[] grades) {
        double gradesSum = 0;
        for (int i = 0; i < grades.length; i++) {
            gradesSum += grades[i];
        }
        return gradesSum / grades.length;
    }
}

class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student("Goku");

        double grade1 = Validation.getValidation("Enter your first grade: ", scanner);
        double grade2 = Validation.getValidation("Enter your second grade: ", scanner);
        double grade3 = Validation.getValidation("Enter your third grade: ", scanner);
        double grade4 = Validation.getValidation("Enter your fourth grade: ", scanner);

        double[] grades = {grade1, grade2, grade3, grade4};

        double average = Average.averageCalculator(grades);

        if (average > 7) {
            System.out.println("Great job, " + student.name + "! With an average of " + average + ", You passed!");
        } else {
            System.out.println("Unfortunately, " + student.name + ", with an average of " + average + ", you didn't pass.");
        }
    }
}
