package Beginner.Conditions;
/*
 * SWITCH CASES
 * The switch statement in java is a control structure that allows us to
 * execute different blocks of code based on a specific value. It is an
 * alternative to multiple if-else statements, making code cleaner and more readable*/

import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // open scanner

        System.out.println("Choose a character: " +
                "\n1 - Naruto Uzumaki" +
                "\n2 - Sasuke Uchiha" +
                "\n3 - Sakura Haruno");

        int userChoose = input.nextInt();

        switch (userChoose) {
            case 1:
                System.out.println("You chose Naruto");
                break;
            case 2:
                System.out.println("You chose Sasuke");
                break;
            case 3:
                System.out.println("You chose Sakura");
                break;
            default:
                System.out.println("Invalid chose");
        }

        input.close(); // close scanner
    }
}
