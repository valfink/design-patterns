package org.example;

public class BankAccount {
    private int balance;
    private final BankAccountMemento initialState;

    public BankAccount(int balance) {
        this.balance = balance;
        initialState = new BankAccountMemento(balance);
    }

    public int getBalance() {
        return balance;
    }

    public BankAccountMemento deposit(int amount) {
        balance += amount;
        return new BankAccountMemento(balance);
    }

    public void returnToState(BankAccountMemento memento) {
        balance = memento.balance();
    }

    public void resetToInitialState() {
        balance = initialState.balance();
    }
}
