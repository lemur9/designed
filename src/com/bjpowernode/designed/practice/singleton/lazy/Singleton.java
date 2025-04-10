package com.bjpowernode.designed.practice.singleton.lazy;

/**
 * 懒汉式
 */
public class Singleton {
    private Singleton() {}

    private static Singleton singleton;

    public static Singleton getHungry() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public static void main(String[] args) {
        Singleton hungry = Singleton.getHungry();
        Singleton hungry2 = Singleton.getHungry();
        System.out.println(hungry == hungry2);
    }
}
