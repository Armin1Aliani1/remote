package com.homeWorks.thirteen.mainApplication;

import java.util.Date;

public class NotThread implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("Hello : " + new Date());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Stop Hello : " + new Date());
                return;
            }
        }
    }

}
