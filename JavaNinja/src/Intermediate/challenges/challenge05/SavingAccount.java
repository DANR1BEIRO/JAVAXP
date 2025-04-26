package Intermediate.challenges.challenge05;

public class SavingAccount extends BankAccount {

    TypeAccount type;

    public SavingAccount(double balance, int accountNumber) {
        super(balance, accountNumber);
    }

    @Override
    public void deposit(double amount) {

        double fee = amount * 0.01;
        double netAmount = amount - fee;
        this.balance += netAmount;

        System.out.println("Deposit of " + amount + " made. Fee: " + fee + ". New balance: " + this.balance);

    }
}
