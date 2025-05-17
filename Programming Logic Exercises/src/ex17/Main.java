package ex17;

import java.util.Scanner;

class Validation {
    public static int input(String message, Scanner scanner) {
        while (true) {
            System.out.print(message);
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                scanner.nextLine();
                if (input != 1 && input != 2) {
                    System.out.println("Select one of the two availables options");
                } else {
                    return input;
                }
            } else {
                System.out.println("Invalid option! only numbers are allowed!");
                scanner.nextLine();
            }
        }
    }
}

class Convert {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return Math.round(fahrenheit - 32) * 5 / 9;
    }
}

class Menu {
    public static void display() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Celsius to Fahrenheit\n2. Fahrenheit to Celsius");

            int option = Validation.input("Select the type of conversion you want to do: ", scanner);

            if (option == 1) {
                System.out.print("Enter the temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                scanner.nextLine();
                double fahrenheit = Convert.celsiusToFahrenheit(celsius);
                System.out.println("Result: " + celsius + "º celsius = " + fahrenheit + "º fahrenheit.");
                break;
            } else if (option == 2) {
                System.out.print("Enter the temperature in Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();
                scanner.nextLine();
                double celsius = Convert.fahrenheitToCelsius(fahrenheit);
                System.out.println("Result: " + fahrenheit + "º fahrenheit = " + celsius + "º celsius.");
                break;
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Menu.display();
    }
}
