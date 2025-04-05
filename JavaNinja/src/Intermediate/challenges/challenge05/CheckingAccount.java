package Intermediate.challenges.challenge05;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(double balance, int accountNumber) {
        super(balance, accountNumber);
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Deposit amount: " + amount);
        this.balance += amount;
    }
}
