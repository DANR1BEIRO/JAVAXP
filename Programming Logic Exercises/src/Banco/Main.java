package Banco;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca poupanca = new ContaPoupanca();

        cc.setNomeCliente("Gohan");
        cc.setNumeroConta("12345");
        cc.setUsaCheque(true);
        cc.infoCliente();

        cc.depositar(10000);
        cc.sacar(700);

        System.out.println("");

        poupanca.setNomeCliente("Goku");
        poupanca.setNumeroConta("00001");
        poupanca.infoCliente();
        poupanca.depositar(10000);
        poupanca.aplicarRendimento(5);
        poupanca.sacar(3450);
        poupanca.aplicarRendimento(5);
    }
}
