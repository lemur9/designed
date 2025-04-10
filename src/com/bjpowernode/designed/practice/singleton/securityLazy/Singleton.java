package com.bjpowernode.designed.practice.singleton.securityLazy;

/**
 * 懒汉式
 */
public class Singleton {
    private Singleton() {
    }

    private static Singleton singleton;


    public static synchronized Singleton getHungry() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
