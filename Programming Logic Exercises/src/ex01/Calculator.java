package ex01;

/**
 * A calculator class that performs addition and comparison operations
 */

public class Calculator {

    /**
     *
     * @param a the first number
     * @param b the second number
     * @param c the number to compare againts the sum of the first and second ones
     * @return a string describing the relationship between the sum and c
     */

    public String result(int a, int b, int c) {

        int sum = a + b;

        System.out.println("The sum of " + a + " and " + b + " is equal to " + sum);
        if (sum > c) {
            return (sum + " is greater than " + c);
        } else if (sum < c) {
            return (sum + " is smaller than " + c);
        } else {
            return (sum + " is equal to " + c);
        }
    }
}

