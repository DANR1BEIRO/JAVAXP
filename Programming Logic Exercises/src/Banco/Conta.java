package Banco;

public class Conta {

    /**
     * O modificador de acesso 'protected' em java permite o acesso a atributos e métodos
     * dentro do mesmo pacote, e também permite o acesso das subclasses mesmo que estejam
     * em pacotes diferentes
     * Usei o protected como modificador de acesso do atributo saldoConta porque na subclasse
     * ContaPoupanca eu precise atrubuir um valor diretamente para saldoConta
     */
     private String nomeCliente;
    private String numeroConta;
    protected double saldoConta;

    /**
     * Metodo para mostrar as informações do cliente, como: Nome, número da conta e saldo atual
     */
    public void infoCliente(){
        System.out.println("Nome do cliente: " + getNomeCliente());
        System.out.println("Número da conta: " + getNumeroConta());
        System.out.println("Saldo atual: " + getSaldoAtual());
    }

    /**
     * Metodo responsável por depositar saldo na conta
     * @param deposito: quantidade a ser depositada e somada à saldoConta
     */
    public void depositar(double deposito) {
        saldoConta += deposito;
        System.out.printf("Depósito de R$%.2f feito com sucesso!\n", deposito);
        System.out.println("Saldo atual após o depósito: R$" + getSaldoAtual());
    }

    /**
     *  Metodo responsável por sacar saldo da conta
     * @param saque: quantidade a ser sacada(retirada) de saldoConta
     * O if checa se existe saldo disponível para saque; do contrário, printa uma
     * mensagem dizendo que o saldo é insufuciente
     */
    public void sacar(double saque) {
        if (saldoConta - saque < 0) {
            System.out.println("Saldo insuficiente para saque");
            return;
        }
        saldoConta -= saque;
        System.out.printf("Saque de R$%.2f realizado com sucesso!\n", saque);
        System.out.println("Saldo atual após o depósito: R$" + getSaldoAtual());
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldoAtual() {
        return saldoConta;
    }
}

// ESTUDE OS FUNDAMENTOS!!!!!