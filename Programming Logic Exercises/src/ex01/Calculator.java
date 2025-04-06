package ex01;

public class Calculator {

    public String result(int a, int b, int c) {

        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is equal to " + sum);
        if (sum > c) {
            return(sum + " is greater than " + c);
        } else if (sum < c) {
            return(sum + " is smaller than " + c);
        } else {
            return(sum + " is equal to " + c);
        }
    }
}
