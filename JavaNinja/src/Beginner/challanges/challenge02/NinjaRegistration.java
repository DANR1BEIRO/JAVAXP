package Beginner.challanges.challenge02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NinjaRegistration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] ninjas = new String[5];
        int ninjasRegistered = 0;

        while(true) {
            System.out.print("\nNinja Registration:\n1. Register Ninjas" +
                    "\n2. Displays list ninjas\n3. Exit\nChoose an option: ");
            int choose = getIntInput(input);

            switch (choose) {
                case 1:
                    if (ninjasRegistered < 5) {
                        System.out.print("Enter the name of the ninja to be registered: ");
                        String ninjaNameRegister = input.next();
                        ninjas[ninjasRegistered] = ninjaNameRegister;
                        ninjasRegistered++;
                        System.out.println(ninjaNameRegister + " has been registered!");
                    } else {
                        System.out.println("\nThe ninja list is full!");
                    }
                    break;

                case 2:
                    if (ninjasRegistered == 0) {
                        System.out.println("\nThe list is empty.");
                    } else {
                        System.out.println("\nList of ninjas registered:");
                        for (int i = 0; i < ninjasRegistered; i++) {
                            System.out.println(ninjas[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting the program...");
                    input.close();
                    return;

                default:
                    System.out.println("\nInvalid option!");
            }
        }
    }

    public static int getIntInput(Scanner input) {
        while (true) {
            try {
                return input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Only integer numbers are allowed!");
                input.nextLine();
            }
        }
    }
}


