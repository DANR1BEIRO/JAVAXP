package Banco;

public class ContaCorrente extends Conta {
    public boolean usaCheque;

    public ContaCorrente(String nomeConta, int numeroConta) {
        super(nomeConta, numeroConta);
    }

    public void setUsaCheque(boolean usaCheque) {
        this.usaCheque = usaCheque;
    }

    @Override
    public void depositar(double deposito) {
        if (deposito <= 0) {
            System.out.println("Valor inválido! Depósito não realizado!");
            return;
        }
        System.out.printf("Depósito na conta corrente no valor de R$%.2f realizado com sucesso!\n", deposito);
        super.depositar(deposito);
    }

    @Override
    public void sacar(double saque) {
        if (saque <= 0) {
            System.out.println("Valor inválido! Saque não realizado!");
        }
        if (getSaldoAtual() - saque < 0) {
            System.out.println("Saldo insuficiente! Saque não realizado!");
            return;
        }
        System.out.printf("Saque na conta corrente no valor de R$%.2f realizado com sucesso!\n", saque);
        super.sacar(saque);
    }

    @Override
    public void info() {
        super.info();
        if (usaCheque) {
            System.out.println("Faz uso de cheque.\n");
        } else {
            System.out.println("Não faz uso de cheque.\n");

        }
    }
}
