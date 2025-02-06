package com.bjpowernode.designed.pattern.creational.singleton.hungry;

import com.bjpowernode.designed.pattern.creational.singleton.lasy.Run;

public class Test {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Run());
        Thread t2 = new Thread(new Run());
        Thread t3 = new Thread(new Run());

        t1.start();
        t2.start();
        t3.start();

        System.out.println("当前程序结束了...");
    }
}
