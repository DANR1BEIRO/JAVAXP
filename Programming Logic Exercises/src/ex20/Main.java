package ex20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to perform its multiplication table from 1 to 10: ");
        int input = scanner.nextInt();

        multiplicationTableFromAGivenNumber(input);
        scanner.close();
    }

    public static void multiplicationTableFromAGivenNumber(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + number + " = " + i * number);
        }
    }
}
