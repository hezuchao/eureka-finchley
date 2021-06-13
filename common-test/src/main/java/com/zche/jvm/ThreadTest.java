package com.zche.jvm;

public class ThreadTest extends Thread {
    volatile boolean flag = false;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    int i = 0;

    public void run() {
        while (!flag) {
            i++;
        }
    }

    public static void main(String[] args) throws Exception {
        ThreadTest vt = new ThreadTest();
        vt.start();
        Thread.sleep(2000);
        vt.setFlag(true);
        //vt.flag = true;
        System.out.println("stope" + vt.i);
    }
}
