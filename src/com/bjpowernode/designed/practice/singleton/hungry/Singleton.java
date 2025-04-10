package com.bjpowernode.designed.practice.singleton.hungry;

/**
 * 饿汉式
 */
public class Singleton {
    private Singleton() {}

    private static Singleton singleton = new Singleton();

    public static Singleton getHungry() {
        return singleton;
    }

    public static void main(String[] args) {
        Singleton hungry = Singleton.getHungry();
        Singleton hungry2 = Singleton.getHungry();

        System.out.println(hungry == hungry2);
    }
}
