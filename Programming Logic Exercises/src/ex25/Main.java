package ex25;

import java.util.Scanner;

/**
 * 25 - Write a program to calculate the reduction in a smoker's lifespan.
 * Ask for the number of cigarettes smoked per day and how many years the person has smoked.
 * Consider that each cigarette reduces life by 10 minutes.
 * Calculate how many days of life a smoker will lose and display the total in days.
 * 1440 min / day
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cigarettesPerDay = getInt("Enter the number of cigarettes you smoke per day: ", scanner);
        int yearsSmoked = getInt("Enter how many years you have been smoking: ", scanner);
        int totalCigarettesSmoked = yearsSmoked * 365 * cigarettesPerDay;
        int totalMinutesLost = totalCigarettesSmoked * 10;
        int totalDaysLost = totalMinutesLost / 1440;

        System.out.println("You have already lost " + totalDaysLost + " days of your life.");
    }

    public static int getInt(String message, Scanner scanner) {
        while (true) {
            System.out.print(message);
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                scanner.nextLine();
                if (input <= 0) {
                    System.out.println("The number must be positive.");
                    continue;
                }
                return input;
            } else {
                System.out.println("Please enter a valid integer number.");
                scanner.nextLine();
            }
        }
    }
}