package Banco;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("goku", 8001);
        ContaPoupanca cp = new ContaPoupanca("Vegeta", 0001);

        System.out.println("Operações na conta corrente:");
        cc.setUsaCheque(true);
        cc.info();
        cc.depositar(850.23);
        cc.sacar(100);
        cc.sacar(9000);

        System.out.println("\nOperações na conta poupanca:");
        cp.info();
        cp.depositar(600);
        cp.rendimento(5);
        cp.sacar(500);
        cp.rendimento(5);
        cp.sacar(10000);
        cp.rendimento(0);
    }
}
