package Intermediate.challenges.challenge03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NinjaMenu {
    Scanner input = new Scanner(System.in);
    static boolean run = true;
    private Uchiha ninja;

    public void MainMenu() {

        while (run) {
            System.out.print("\nThis is the ninja menu! here some options:" +
                    "\n1. Create a Ninja" +
                    "\n2. Displays ninjas information" +
                    "\n3. Exit" +
                    "\nChoose an option: ");

            int choice = getIntInput(input);

            switch (choice) {
                case 1 -> clanMenu(input);
                case 2 -> displaysNinjasInformation();
                case 3 -> {
                    run = false;
                    System.out.println("Exiting menu...");
                }
                default -> System.out.println("Choose one of the available options!");
            }
        }
        input.close();;
    }

    public void clanMenu(Scanner input) {

        while(true) {
            System.out.print("\nAvailable clan:\n1. Uchiha \n2. Exit\nChoose an option: ");
            int choice = getIntInput(input);
            input.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("\nLooks like you're on the path of the Uchiha!" +
                        "\nFun facts about the Uchiha Clan:" +
                        "\n- Sharingan (maybe even Mangekyou)" +
                        "\n- Uchiha are natural fire users" +
                        "\n- You might have some tragic backstory (every uchiha does :D" +
                        "\n- And of course, you're OP AS HELL in battle!");
                    createNinja();
                    return;
                }
                case 2 -> {
                    System.out.println("Exiting clan menu...");
                    return;
                }
                default -> System.out.println("Choose one of the available options!");
            }
        }
    }

    public void displaysNinjasInformation (){
        if (ninja == null) {
            System.out.println("\nNo ninja has been created yet!");
        } else {
            System.out.println("\nNinja created: ");
            ninja.displaysInfo();
        }
    }

    public void createNinja () {
        System.out.print("\nLet's create a new Uchiha!");

        ninja = new Uchiha();
        System.out.print("\nName: ");
        ninja.setName(getStringInput(input));

        System.out.print("Age: ");
        ninja.setAge(getIntInput(input));
        input.nextLine();

        System.out.print("Village: ");
        ninja.setVillage(getStringInput(input));

        System.out.print("Mission: ");
        ninja.setMission(getStringInput(input));

        System.out.print("Mission rank: ");
        ninja.setMissionRank(getStringInput(input));

        System.out.print("Mission status: ");
        ninja.setMissionStatus(getStringInput(input));

        System.out.println("Ninja successfully created! ");

        displaysNinjasInformation();

    }
    public static int getIntInput(Scanner input){
        while(true) {
            try {
                return input.nextInt();
            } catch(InputMismatchException e) {
                System.out.print("\nOnly integer numbers are allowed!\nTry again: ");
                input.nextLine();
            }
        }
    }
    public static String getStringInput(Scanner input){
        while(true) {
            String inputUser = input.nextLine();
            if (inputUser.matches("[a-zA-Z ]+")) {
                return inputUser;
            } else {
                System.out.print("\nOnly letters are allowed!\nTry again: ");
            }
        }
    }
}


