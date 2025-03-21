import java.util.Scanner;

public class CaixaEletronico {

    public static int obterValorSaque(Scanner scanner){
        System.out.print("Digite o valor do saque: ");
        int valor = scanner.nextInt();
        return valor;
    }

    public static int[] calcularNotas(int valor, int[] notas){
        int[] quantidadeNotas = new int[notas.length];

        // Passo 3 = Calcular a quantidade de cada nota
        for (int i = 0; i < notas.length; i++) {
            if(valor >= notas[i]) {
                quantidadeNotas[i] = valor / notas[i];
                valor %= notas[i];
            }
        }
        return quantidadeNotas;
    }
    public static void exibirNotas(int[] notas, int[] quantidadeNotas){
        // Passo 4 = Exibir o resultado
        System.out.println("Notas fornecidas: ");
        for (int i = 0; i < notas.length ; i++) {
            if (quantidadeNotas[i] > 0) {
                System.out.println(quantidadeNotas[i] + " notas de " + notas[i]);
            }
        }
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Passo 1 = Receber o valor do saque
        int valor = obterValorSaque(scanner);

        // Passo 2 = Notas disponíveis
        int[] notas = {100, 50, 20, 10, 5, 2, 1};
        int[] quantidadeNotas = calcularNotas(valor, notas);

        exibirNotas(notas, quantidadeNotas);

        scanner.close();
    }
}
