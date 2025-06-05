package Intermediate.DataStructure.Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        /**
         * Estrutura de dados do tipo LIFO(Last In, First Out) onde
         * o último elemento inserido é o primeiro a ser removido.
         */
        Stack<String> stack = new Stack<>();

        stack.push("Java");
        stack.push("Python");
        stack.push("C++");

        System.out.println("Stack: " + stack);

        // Remove o elemento do topo
        String top = stack.pop();
        System.out.println("Elemento removido: " + top);

        // Verifica o topo sem remover
        String atualTopo = stack.peek();
        System.out.println("Topo atual: " + atualTopo);

        // Verifica se a pilha está vazia
        System.out.println("Está vazia: " + stack.empty());

        // Procura um elemento
        int posicao = stack.search("Java");
        System.out.println("Posicao de Java: " + posicao);
    }
}
