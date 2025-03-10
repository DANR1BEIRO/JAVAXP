package Chapter02_InputOutputAndOperators.exercises;/*
 * Write an application that reads five integers and determines and
 * prints the largest and smallest integers in the group.
 */

import java.util.Scanner;
public class Class05LargestAndSmallestIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        for(int i = 0; i < 5; i++) {
            System.out.print("Enter integer " + ( i + 1) + ": ");
            numbers[i] = input.nextInt();
        }
        int largest = numbers[0],
            smallest = numbers[0];

        for (int i = 1; i < 5; i ++ ) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            } else {
                smallest = numbers[i];
            }
        }
        System.out.println("The largest integer is: " + largest);
        System.out.println("The smalles integer is: " + smallest);
        input.close();
    }
}
