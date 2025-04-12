package Banco;

public class ContaCorrente extends Conta {
    private boolean usaCheque;


    public void setUsaCheque(boolean usaCheque) {
        this.usaCheque = usaCheque;
    }

    @Override
    public void depositar(double deposito) {
        saldoConta += deposito;
        System.out.printf("Depósito de R$%.2f na conta corrente feito com sucesso!\n", deposito);
        System.out.println("Saldo atual da conta corrente após o depósito: R$" + getSaldoAtual());
    }

    @Override
    public void sacar(double saque) {
        if (saldoConta - saque < 0) {
            System.out.println("Saldo insuficiente para saque");
            return;
        }
        saldoConta -= saque;
        System.out.printf("Saque de R$%.2f da conta corrente realizado com sucesso!\n", saque);
        System.out.println("Saldo atual da conta corrente após o depósito: R$" + getSaldoAtual());
    }

    @Override
    public void infoCliente() {
        super.infoCliente();
        System.out.println("Conta corrente possui cheque: " + usaCheque);
    }
}

