package Intermediate.challenges.challenge05;

public class Main {
    public static void main(String[] args) {

        CheckingAccount checking = new CheckingAccount(0, 1223);
        checking.deposit(750);
        checking.checkBalance();

        System.out.println();

        SavingAccount saving = new SavingAccount(0, 1332);
        saving.deposit(600);
        saving.deposit(10);
        saving.checkBalance();


    }
}

