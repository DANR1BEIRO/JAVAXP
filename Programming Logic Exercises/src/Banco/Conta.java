package Banco;

public class Conta {

    private String nomeConta;
    private int numeroConta;
    private double saldoAtual;

    public Conta() {
    }

    public Conta(String nomeConta, int numeroConta) {
        this.nomeConta = nomeConta;
        this.numeroConta = numeroConta;
    }

    public void somaAoSaldoAtual(double rendimento) {
        this.saldoAtual += rendimento;
    }

    public void depositar(double deposito) {
        if (deposito <= 0) {
            System.out.println("Valor inválido! depósito não realizado!");
            return;
        }
        saldoAtual += deposito;
        System.out.println("Saldo atual após depósito: R$" + saldoAtual);
    }

    public void sacar(double saque) {
        if (saldoAtual - saque < 0) {
            System.out.println("Saldo insuficiente! Saque não realizado!");
            return;
        }
        saldoAtual -= saque;
        System.out.println("Saldo atual após saque: R$" + saldoAtual);
    }

    public void info() {
        System.out.println("Nome do cliente: " + nomeConta);
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Saldo atual: " + saldoAtual);
    }

    public String getNomeConta() {
        return nomeConta;
    }

    public void setNomeConta(String nomeConta) {
        this.nomeConta = nomeConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }
}
