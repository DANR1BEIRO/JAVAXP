package ex03;

import com.sun.source.util.SourcePositions;

public class Main {
    public static void main(String[] args) {
        Operation operation = new Operation();

        int a = operation.numberCheck("First number: ");
        int b = operation.numberCheck("Second number: ");

        operation.conditional(a, b);
    }
}
