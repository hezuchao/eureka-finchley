package com.zche.thread;

import java.util.concurrent.*;

public class ThreadTest {
    public static void main(String[] args) throws Exception {
        MyThread1 myThread1 = new MyThread1();
        myThread1.start();

        MyThread2 myThread2 = new MyThread2();
        myThread2.run();

        Thread thread1 = new Thread(myThread2);
        thread1.start();

        Callable<String> callable1 = new MyThread3("FutureTask1");
        String callResult = callable1.call();
        System.out.println(callResult);

        Callable<String> callable2 = new MyThread3("FutureTask2");
        FutureTask<String> task = new FutureTask<>(callable2);
        Thread thread2 = new Thread(task);
        thread2.start();
        String taskResult = task.get();
        System.out.println(taskResult);

        ExecutorService pool = Executors.newFixedThreadPool(5);
        pool.execute(myThread2);
        pool.execute(() -> {
            try {
                Thread.sleep(1000);
                System.out.println("线程MyThread4.run...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Callable<String> callable3 = new MyThread3("FutureTask3");
        FutureTask<String> task2 = new FutureTask<>(callable3);
        Thread thread3 = new Thread(task2);
        pool.execute(thread3);
        String result = task2.get();
        System.out.println(result);
        Future<?> future = pool.submit(myThread1);
        System.out.println(future.get());
        Future<String> future1 = pool.submit(callable1);
        System.out.println(future1.get());
        pool.shutdown();
    }
}
