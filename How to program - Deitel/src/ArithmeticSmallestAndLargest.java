/**
 * Write an application that inputs three integers from the user and displays
 * the sum, average, product, smallest and largest of the numbers.
 * Note: The calculation of the average in this exercise should result in an integer
 * representation of the average. So, if the sum of the values is 7, the average should
 * be 2, not 2.3333...
 */
import java.util.Scanner;

public class ArithmeticSmallestAndLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = askTheNumber(input, "Enter the first number: "),
            number2 = askTheNumber(input, "Enter the second number: "),
            number3 = askTheNumber(input, "Enter the third number: "),
            sum = number1 + number2 + number3,
            average = sum / 3,
            product = number1 * number2 * number3,
            largest,
            smallest;

            if (number1 >= number2 && number1 >= number3) {
                largest = number1;
            } else if (number2 >= number1 && number2 >= number3) {
                largest = number2;
            } else {
                largest = number3;
            }

            if (number1 <= number2 && number1 <= number3) {
                smallest = number1;
            } else if (number2 <= number1 && number2 <= number3) {
                smallest = number2;
            } else {
                smallest = number3;
            }

            System.out.printf("\nSum: %d", sum);
            System.out.printf("\nAverage %d", average);
            System.out.printf("\nProduct: %d", product);
            System.out.printf("\nThe smallest number is %d", smallest);
            System.out.printf("\nThe largest number is %d\n", largest);

            input.close();
    }

    static int askTheNumber(Scanner input, String message) {
        System.out.print(message);
        return input.nextInt();
    }
    

}
