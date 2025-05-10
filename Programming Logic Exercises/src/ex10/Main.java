package ex10;


import java.util.Scanner;

class Grade {
    public static int getGrade(String message, Scanner scanner) {
        while (true) {
            System.out.print(message);
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                scanner.nextLine();
                return input;
            } else {
                System.out.println("Only numbers are allowed");
                scanner.nextLine();
            }
        }
    }
}

class Average {
    public static double getAverage(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int grade1 = Grade.getGrade("Enter the first grade: ", scanner);
        int grade2 = Grade.getGrade("Enter the second grade: ", scanner);
        int grade3 = Grade.getGrade("Enter the third grade: ", scanner);
        double average = Average.getAverage(grade1, grade2, grade3);

        System.out.printf("The average is %.1f", average);
    }
}
