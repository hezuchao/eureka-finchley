package com.zche.thread;

public class MyThread2 implements Runnable {
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("线程MyThread2.run...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
