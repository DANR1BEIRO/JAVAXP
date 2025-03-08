package FlowControlChallenge;
import java.util.Scanner;

class InvalidParametersException extends Exception {
    public InvalidParametersException(String message) {
        super(message);
    }
}
public class Counter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first parameter: ");
        int firstParameter = scanner.nextInt();

        System.out.print("Enter the second parameter: ");
        int secondParameter = scanner.nextInt();

        try {
            count(firstParameter, secondParameter);
        } catch (InvalidParametersException exception) {
            System.out.println("The second parameter must be greater than the first");
        }

        scanner.close();
    }
    static void count(int firstParameter, int secondParameter) throws InvalidParametersException {
        if (firstParameter > secondParameter) {
            throw new InvalidParametersException("The second parameter must be greater than the first");
        }
        int count = secondParameter - firstParameter;
        for (int i = 1; i <= count; i++) {
            System.out.println("Printing number " + i);
        }
    }
}
