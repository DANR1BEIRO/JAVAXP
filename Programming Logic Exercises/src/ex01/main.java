import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the 1st number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the 2nd number: ");
        int b = scanner.nextInt();

        System.out.print("Enter the 3rd number: ");
        int c = scanner.nextInt();

        int result = a + b;

        System.out.println("The sum of " + a + " and " + b + " is: " + result);

        if (result > c) {
            System.out.println(result + " is greater than " + c);
        } else if (result < c) {
            System.out.println(result + " is smaller than " + c);
        } else {
            System.out.println(result + " is equal to " + c);
        }
    }
}
