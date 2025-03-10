package Chapter02_InputOutputAndOperators.exercises; /**
 * Write an application that asks the user to enter two integers,
 * obtains them from the user and displays the larger number followed
 * by the words "is larger". If the numbers are equal, print the message
 * "these numbers are equal".
 */

 import java.util.Scanner;

public class Class02ComparingIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        if (number1 > number2) {
            System.out.printf("%d is larger\n21", number1);

        } else if (number1 < number2){
            System.out.printf("%d is larger\n", number2);

        } else {
            System.out.println("These numbers are equal");
        }
    }
        
}


  
