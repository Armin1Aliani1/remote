package com.homeWorks.thirteen.fixAProgramError;

public class CheckingAccount {

    private int balance;

    public CheckingAccount(int initialBalance) {
        balance = initialBalance;
    }

    public boolean withdraw(int amount) {
        if (amount <= balance) {
            try {
                Thread.sleep((int) (Math.random() * 200));
            } catch (InterruptedException e) {
            }
//            balance -= amount;
            if (amount <= balance) {
                balance -= amount;
                return true;
            } else {
                return false;
            }
//            return true;
        }
        return false;
    }

}
