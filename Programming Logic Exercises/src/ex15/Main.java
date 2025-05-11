package ex15;

import java.time.LocalDate;
import java.util.Scanner;

class YearValidation {
    public static int yearValidation(String message, Scanner scanner) {
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

class MonthValidation {
    public static int monthValidation(String message, Scanner scanner) {
        while (true) {
            System.out.print(message);
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                scanner.nextLine();
                if (input > 0 && input < 13) {
                    return input;
                } else {
                    System.out.println("Only numbers between 1 to 12 are allowed");
                    scanner.nextLine();
                }
            } else {
                System.out.println("Only numbers are allowed!");
                scanner.nextLine();
            }
        }
    }
}

class DayValidation {
    public static int dayValidation(String message, Scanner scanner) {
        while (true) {
            System.out.print("Enter your day of birth (1-30): ");
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                scanner.nextLine();
                if (input > 0 && input < 31) {
                    return input;
                } else {
                    System.out.println("Only numbers between 1 to 30 are allowed");
                }
            } else {
                System.out.println("Only numbers are allowed");
                scanner.nextLine();
            }
        }
    }
}

class CurrentDate {
    static LocalDate today = LocalDate.now();

    public static int currentYear() {
        return today.getYear();
    }

    public static int currentMonth() {
        return today.getMonthValue();
    }

    public static int currentDay() {
        return today.getDayOfMonth();
    }
}

class TotalDaysBorn {
    public static int days(int birthYear, int birthMonth, int birthDay) {
        return (birthYear * 365) + (birthMonth * 30) + birthDay;
    }
}

class TotalDayNow {
    public static int days(int currentYear, int currentMonth, int currentDay) {
        return (currentYear * 365) + (currentMonth * 30) + currentDay;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int birthYear = YearValidation.yearValidation("Enter the year of born: ", scanner);
        int birthMonth = MonthValidation.monthValidation("Enter the month of born (1-12): ", scanner);
        int birthDay = DayValidation.dayValidation("Enter the day of born (1-30: ", scanner);

        int totalDaysBorn = TotalDaysBorn.days(birthYear, birthMonth, birthDay);
        int totalDaysNow = TotalDayNow.days(CurrentDate.currentYear(), CurrentDate.currentMonth(), CurrentDate.currentDay());

        int livedDays = totalDaysNow - totalDaysBorn;

        int years = livedDays / 365;
        int months = (livedDays % 365) / 30;
        int days = (livedDays % 365) % 30;

        System.out.println("You've lived: " + years +
                " years, " + months + " months and " + days + " days.");
    }
}



