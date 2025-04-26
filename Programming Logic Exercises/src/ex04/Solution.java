package ex04;

import java.util.Scanner;

public class Solution {
    Scanner scanner = new Scanner(System.in);

    public String predecessorAndSuccessor() {
        while (true) {
            System.out.print("Enter an integer number to check the predecessor and the successor: ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                int predecessor = number - 1;
                int successor = number + 1;
                return ("The predecessor of " + number + " is " + predecessor + "\n" +
                        "The successor of " + number + " is " + successor);
            } else {
                System.out.println("Invalid number! must be an integer!");
                scanner.next();
            }
        }
    }
}
