import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        int [] numbers = new int[10]; // starts an array of integers


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        System.out.println(Arrays.toString(numbers));
    }

}
