package com.zche.jvm;

public class DoubleTest {
    public static void main(String[] args) {
        Integer i1 = 40;
        Integer i2 = 40;
        Integer i3 = 400;
        Integer i4 = 400;
        Long l1 = 40L;
        Long l2 = 40L;
        Double d1 = 40.0;
        Double d2 = 40.0;
        Float f1 = 40.0F;
        Float f2 = 40.0F;
        System.out.println("i1=i2   " + (i1 == i2));//i1=i2   true
        System.out.println("i3=i4   " + (i3 == i4));//i3=i4   false
        System.out.println("l1=l2   " + (l1 == l2));//l1=l2   true
        System.out.println("d1=d2   " + (d1 == d2));//d1=d2   false
        System.out.println("f1=f2   " + (f1 == f2));//f1=f2   false
        int j = 0;
        j = ++j;
        System.out.println(j);
        int i = 0;
        i = i++;
        System.out.println(i);
    }
}
