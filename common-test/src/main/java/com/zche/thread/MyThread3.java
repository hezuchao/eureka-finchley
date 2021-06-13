package com.zche.thread;

import java.util.concurrent.Callable;

public class MyThread3 implements Callable<String> {
    private final String rtn;

    public MyThread3(String rtn) {
        this.rtn = rtn;
    }

    public String call() throws Exception {
        System.out.println(rtn + "线程MyThread3.run...");
        return rtn + "线程MyThread3.run...";
    }
}
