package com.zche.config.client.test;

public class Test2 {
    public static void main(String[] args) {
        B b;
        C c = new C();
        D d = new D();
        E e = new E();
        b = c;
        b = e;
        d = e;
    }
}
class B {}
class C extends B {}
class D extends B {}
class E extends D {}
