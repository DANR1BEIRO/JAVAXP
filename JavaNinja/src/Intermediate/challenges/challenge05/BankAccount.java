package Intermediate.challenges.challenge05;

public abstract class BankAccount implements Account {

    double balance;
    int accountNumber;

    public BankAccount(double balance, int accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    @Override
    public void checkBalance() {
        System.out.println("The balance is: " + balance);
    }

    @Override
    public abstract void deposit(double amount);
}
