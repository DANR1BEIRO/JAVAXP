public class Loop01 {
    public static void main(String[] args) {
        int number = 5;

        System.out.println("BEFORE THE FOR LOOP:");
        for (int i = number; i > 0; i--) {
            System.out.println("In the for loop");
            System.out.println("Value of number is " + i);
        }
        System.out.println("After the for loop");

        System.out.println("\nBEFORE THE WHILE LOOP:");
        while (number > 0) {
            System.out.println("In the while loop");
            System.out.println("Value of number is " + number);
            number--;
        }
        System.out.println("After the while loop");
    }
}
