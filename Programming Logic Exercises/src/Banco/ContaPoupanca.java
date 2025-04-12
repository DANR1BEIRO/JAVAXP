package Banco;

public class ContaPoupanca extends Conta {

    @Override
    public void depositar(double deposito) {
        saldoConta += deposito;
        System.out.printf("Depósito de R$%.2f na conta poupança feito com sucesso!\n", deposito);
        System.out.println("Saldo atual da conta poupança após o depósito: R$" + getSaldoAtual());
    }

    @Override
    public void sacar(double saque) {
        if (saldoConta - saque < 0) {
            System.out.println("Saldo insuficiente para saque");
            return;
        }
        saldoConta -= saque;
        System.out.printf("Saque de R$%.2f da conta poupança realizado com sucesso!\n", saque);
        System.out.println("Saldo atual da conta poupança após o depósito: R$" + getSaldoAtual());
    }

    /**
     * Metodo responsavel por receber um percentual e aplicar um rendimento
     * desse percentual à saldoConta da poupança
     * @param percentual: quantidade do percentual a ser somado à saldoConta da poupança
     */
    public void aplicarRendimento(double percentual) {
        double saldo = getSaldoAtual();
        double rendimento = saldo * (percentual / 100);
        saldoConta += rendimento;
        System.out.println("Dado o percentual de " + percentual +
                "%, a poupança teve rendimento de: R$" + rendimento);
        System.out.println("Saldo atual após o rendimento: R$" + getSaldoAtual());
    }
}
