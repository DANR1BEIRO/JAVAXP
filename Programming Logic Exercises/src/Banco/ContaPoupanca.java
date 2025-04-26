package Banco;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(String nomeConta, int numeroConta) {
        super(nomeConta, numeroConta);
    }

    @Override
    public void depositar(double deposito) {
        if (deposito <= 0) {
            System.out.println("Valor inválido! Depósito não realizado!");
            return;
        }
        System.out.printf("Depósito na conta poupança no valor de R$%.2f realizado com sucesso!\n", deposito);
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
        System.out.printf("Saque na conta poupança no valor de R$%.2f realizado com sucesso!\n", saque);
        super.sacar(saque);
    }

    public void rendimento(double percentual) {
        if(percentual <= 0) {
            System.out.println("Nenhum rendimento aplicado.");
            return;
        }
        double saldo = getSaldoAtual();
        double rendimento = (saldo * percentual) / 100;
        somaAoSaldoAtual(rendimento);
        System.out.println("Dado o percentual de " + percentual + "% a conta poupança rendeu " + rendimento);
        System.out.println("Saldo da conta poupança após o rendimento: R$" + getSaldoAtual());
    }
}