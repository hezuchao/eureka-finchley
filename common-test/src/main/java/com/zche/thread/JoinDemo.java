package com.zche.thread;

public class JoinDemo extends Thread {
    int i;

    public JoinDemo(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            if (i < 5) {
                i += 1;
                JoinDemo joinDemo = new JoinDemo(i);
                joinDemo.start();
                //调用上一个线程的join方法，大家可以自己演示的时候可以把这行代码注释掉
                joinDemo.join();
                System.out.println("num:" + i);
            } else {
                System.out.println("====end====");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            Thread mainThread = Thread.currentThread();
            System.out.println(mainThread);
            JoinDemo joinDemo = new JoinDemo(0);
            joinDemo.start();
            //调用上一个线程的join方法，大家可以自己演示的时候可以把这行代码注释掉
            joinDemo.join();
            System.out.println(mainThread);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
