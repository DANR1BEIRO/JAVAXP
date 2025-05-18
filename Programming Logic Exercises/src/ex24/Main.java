package ex24;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double time = getDouble("Enter the time spent on the trip (in hours): ", scanner);
        double averageSpeed = getDouble("Enter the average speed (in km/h): ", scanner);
        double distance = time * averageSpeed;
        double fuelUsed = distance / 12;

        System.out.println("The total distance traveled was: " + distance + "km.");
        System.out.println("The amount of fuel used was: " + Math.round(fuelUsed) + " liters.");

    }

    public static double getDouble(String message, Scanner scanner) {
        while (true) {
            System.out.print(message);
            if (scanner.hasNextDouble()) {
                double input = scanner.nextDouble();
                scanner.nextLine();
                if (input <= 0) {
                    System.out.println("Must be greater than zero");
                    continue;
                }
                return input;
            } else {
                System.out.println("Must be a number");
                scanner.nextLine();
            }
        }
    }
}
