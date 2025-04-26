package ex02;

public class Operation {

    /**
     * Checks if the number is even or odd, and prints the result.
     * @param number The number to analyze.
     */

    public void evenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }

    /**
     * Checks if the number is positive, negative or zero and prints the result.
     * @param number The number to analyze
     */

    public void positiveOrNegative(int number) {
        if (number < 0) {
            System.out.println(number + " is a negative number.");
        } else if (number > 0) {
            System.out.println(number + " is a positive number.");
        } else {
            System.out.println(number + " is equal to 0.");
        }
    }
}
