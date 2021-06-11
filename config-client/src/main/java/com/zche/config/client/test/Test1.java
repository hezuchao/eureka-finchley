package com.zche.config.client.test;

public class Test1 {
    public static int x = 0;
    public int y = 0;
}
class A {
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        Test1 t2 = new Test1();
        t1.x = 1;
        t2.x = 2;
        t1.y = 1;
        t2.y = 2;
        System.out.println(t1.x + t1.y);
    }
}
