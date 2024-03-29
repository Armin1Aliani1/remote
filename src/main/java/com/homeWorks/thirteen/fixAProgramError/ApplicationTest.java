package com.homeWorks.thirteen.fixAProgramError;

public class ApplicationTest {
    public static void main(String[] args) {
        final CheckingAccount ca = new CheckingAccount(100);
        Runnable r = new Runnable() {
            @Override
            public void run() {
                String name = Thread.currentThread().getName();
                for (int i = 0; i < 10; i++) {
                    System.out.println(name + " withdraws $10 : " + ca.withdraw(10));
                }
            }
        };
        Thread threadHusband = new Thread(r);
        threadHusband.setName("Husband");
        Thread threadWife = new Thread(r);
        threadHusband.setName("Wife");
        threadHusband.start();
        threadWife.start();
    }
}
