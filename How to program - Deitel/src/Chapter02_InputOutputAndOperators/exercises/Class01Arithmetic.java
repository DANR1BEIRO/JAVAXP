package Chapter02_InputOutputAndOperators.exercises; /**
 * Write an application that asks the user to enter two integers, obtains them
from the user and prints their sum, product, difference and quotient (division).

 */
import java.util.Scanner;

public class Class01Arithmetic {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in); 

       System.out.print("Enter the first number: ");
       int number1 = input.nextInt();

       System.out.print("Enter the second number: ");
       int number2 = input.nextInt();

       System.out.println("The sum is: " + (number1+number2));
       System.out.println("The product is: " + (number1*number2));
       System.out.println("The difference is: " + (number1-number2));

       if (number2 == 0) {
           System.out.println("Can't divide by zero!");
        } else {
           System.out.println("The quotient is: " + ((double) number1/number2));
       }

       input.close();
    }
    
}
