package com.zche.exam;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("请输入四位卡号：");
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();
        String[] strs = in.split("");
        int a = Integer.parseInt(strs[0]);
        int b = Integer.parseInt(strs[1]);
        int c = Integer.parseInt(strs[2]);
        int d = Integer.parseInt(strs[3]);
        int sum = a+b+c+d;
        System.out.println("卡号各位之和是：" + sum);
    }
}
