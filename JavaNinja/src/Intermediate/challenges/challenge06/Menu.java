package Intermediate.challenges.challenge06;

import java.util.Scanner;

public class Menu {
    private LinkedListNinja ninjaList;
    private Scanner scanner;

    public Menu() {
        this.ninjaList = new LinkedListNinja();
        this.scanner = new Scanner(System.in);
    }

    private void addNinja() {
        System.out.println("========ADDING NEW NINJA========");

        String name = getString("Enter the ninja's name: ", scanner);
        int age = getInt("Enter the ninja's age: ", scanner);
        String village = getString("Enter the ninja's village: ", scanner);

        ninjaList.prependNinja(name, age, village);
        System.out.println("Ninja added successfully!");
    }

    private void removeNinja() {
        LinkedListNinja.NodeNinja removed = ninjaList.removeFirstNinja();
        if (removed != null) {
            System.out.println(removed.name + " was removed!");
        } else {
            System.out.println("Can't remove, the list is empty");
        }
    }

    private void getNinjaByIndex() {
        int index = getInt("Enter index to search: ", scanner);
        LinkedListNinja.NodeNinja ninja = ninjaList.getIndex(index);

        if (ninja != null) {
            System.out.println("The ninja at index " + index + " is: " + ninja.name);
        } else {
            System.out.println("No ninja at index " + index);
        }
    }

    public void displayMenu() {
        int choice;
        do {
            System.out.println("\n========MENU NINJA========");
            System.out.println(
                    "1. Add Ninja\n" +
                            "2. Remove First Ninja\n" +
                            "3. Display all Ninjas\n" +
                            "4. Get Ninja by index\n" +
                            "0. Exit\n");
            choice = getInt("Enter your choice: ", scanner);

            switch (choice) {
                case 1:
                    addNinja();
                    break;
                case 2:
                    removeNinja();
                    break;
                case 3:
                    ninjaList.displayNinjas();
                    break;
                case 4:
                    getNinjaByIndex();
                    break;
                case 0:
                    System.out.println("Closing menu...");
                    break;
                default:
                    System.out.println("Invalid option!");
            }

        } while (choice != 0);

        scanner.close();
    }

    public static String getString(String message, Scanner scanner) {
        while (true) {
            System.out.print(message);
            String input = scanner.nextLine().trim();

            if (input.matches("[a-zA-Z-À-ú\\s'-]+")) {
                return input;
            } else {
                System.out.println("Invalid input! only letters are allowed");
            }
        }
    }

    public int getInt(String message, Scanner scanner) {
        while (true) {
            System.out.print(message);
            try {
                int input = Integer.parseInt(scanner.nextLine());
                return input;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input!");
            }
        }
    }

    public Scanner getScanner() {
        return scanner;
    }
}
