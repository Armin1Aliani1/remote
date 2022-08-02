package com.homeWorks.thirteen;

public class ApplicationHWThirteenForPrintHello {
    public static void main(String[] args) throws InterruptedException {

        NotThread notThread = new NotThread();
        Thread thread = new Thread(notThread);
        thread.start();
        Thread.sleep(2000);
        thread.interrupt();
        
    }
}
