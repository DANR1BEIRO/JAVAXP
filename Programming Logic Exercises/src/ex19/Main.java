package ex19;

public class Main {
    public static void main(String[] args) {
        multiplicationTable();
    }

    public static void multiplicationTable() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x 10 = " + i * 10);
        }
    }
}
