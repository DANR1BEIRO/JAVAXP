You're going to create a program to manage different types of bank accounts at the Bank of Konoha.
The goal is to use abstract classes and interfaces to define common and specific behaviors for different types of account.

1. Create an interface called *Account* with the methods *checkBalance()* and *deposit(double amount)*.

2. Create an abstract class called BankAccount that implements the Account interface.

3. Create an class called *CheckingAccount* that extends the *BankAccount* class. 

4. Implement the *deposit(double amount)* method to add the amount to the balance.

5. Create a class called *SavingAccount* that also extends the *BankAccount* class.
6. Implement the *deposit(double amount)* method to add the amount to the balance with a small
deposit fee(for example, deduct 1% of the deposited amount).