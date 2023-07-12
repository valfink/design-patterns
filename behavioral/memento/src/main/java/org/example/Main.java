package org.example;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(100);
        BankAccountMemento memento1 = bankAccount.deposit(200);
        BankAccountMemento memento2 = bankAccount.deposit(50);

        System.out.println("Balance currently is: " + bankAccount.getBalance());

        bankAccount.returnToState(memento1);
        System.out.println("Balance now is: " + bankAccount.getBalance());

        bankAccount.resetToInitialState();
        System.out.println("Balance now is: " + bankAccount.getBalance());

        bankAccount.returnToState(memento2);
        System.out.println("Balance now is: " + bankAccount.getBalance());
        ;
    }
}