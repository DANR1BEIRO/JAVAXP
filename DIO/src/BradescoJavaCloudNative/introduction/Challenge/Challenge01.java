package BradescoJavaCloudNative.introduction.Challenge;
/**
 * Implemente um programa em Java que receba o saldo inicial de uma conta bancária
 * e três transações (positivas para depósitos e negativas para saques).
 * O programa deve calcular e exibir o saldo final da conta.
 */

import java.util.Scanner;

public class Challenge01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o saldo inicial: ");
        double saldoInicial = scanner.nextDouble();

        System.out.print("Digite o valor da primeira transação: ");
        double transacao1 = scanner.nextDouble();

        System.out.print("Digite o valor da segunda transação: ");
        double transacao2 = scanner.nextDouble();

        System.out.print("Digite o valor da terceira transação: ");
        double transacao3 = scanner.nextDouble();

        double saldoFinal = saldoInicial + transacao1 + transacao2 + transacao3;

        System.out.printf("Saldo final: %.2f\n", saldoFinal);

        scanner.close();
    }
}