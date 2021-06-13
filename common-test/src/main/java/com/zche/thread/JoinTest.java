package com.zche.thread;

public class JoinTest {
    public static void main(String[] args) throws InterruptedException {
        MyThread1 myThread1 = new MyThread1();
        Thread thread1 = new Thread(() -> {
            try {
                Thread.sleep(5000);
                System.out.println("线程thread1.run...");
                Thread thread2 = new Thread(() -> {
                    try {
                        Thread.sleep(10000);
                        System.out.println("线程thread2.run...");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
                thread2.start();
                thread2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread1.start();
        /*
        join的意思是使得放弃当前线程的执行，并返回对应的线程，例如下面代码的意思就是：
        程序在main线程中调用t1线程的join方法，则main线程放弃cpu控制权，并返回t1线程继续执行直到线程t1执行完毕
        所以结果是t1线程执行完后，才到主线程执行，相当于在main线程中同步t1线程，t1执行完了，main线程才有执行的机会
         */
        thread1.join();
        myThread1.start();
    }
}
