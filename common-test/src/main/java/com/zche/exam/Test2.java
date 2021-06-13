package com.zche.exam;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("请输入小明的成绩：");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if (score == 100) {
            System.out.println("爸爸给他买辆车");
        } else if (score >= 90) {
            System.out.println("妈妈给他买Ipad");
        } else if (score >= 60) {
            System.out.println("妈妈给他买本参考书");
        } else {
            System.out.println("什么都不买");
        }
    }
}
