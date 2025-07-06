package com.encapsulation;

public class Account {
    private String id;
    private String name;
    private int balance;

    public Account(String id, String name) {
        balance = 0;
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance can not be negative");
        }
    }

    public int credit(int amount) { // add to account
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("The amount can not be zero or negative");
        }

        return balance;
    }

    public int debit(int amount) { // remove from account
        if (amount <= 0) {
            System.out.println("The amount can not be zero or negative");
        } else if ((balance - amount) >= 0) { // check if the balance is capable of the deduction
            balance -= amount;
        } else {
            System.out.println("Not enough balance");
        }

        return balance;
    }

    public int transferTo(Account another, int amount) {
        if (amount <= 0) {
            System.out.println("The amount can not be zero or negative");
        } else if ((balance - amount) >= 0) { // check if the balance is capable of the deduction
            balance -= amount;
            int anotherNewBalance = another.credit(amount);
//            System.out.println("your friend has this much balance:");
//            System.out.println(anotherNewBalance);
        } else {
            System.out.println("Not enough balance");
        }

        return balance;
    }

    public String toString() { // print everything about the object
        return "Hello " + name + ", your account with ID:" + id +
                " has this much balance: " + balance + "SAR";
    }
}
