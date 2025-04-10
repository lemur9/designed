package com.bjpowernode.designed.practice.singleton.doubleSecurityLazy;

/**
 * 懒汉式
 */
public class Singleton {
    private Singleton() {
    }

    private volatile static Singleton singleton;


    public static Singleton getHungry() {
            if (singleton == null) {
                synchronized (Singleton.class) {
                    singleton = new Singleton();
                }
            }
        return singleton;
    }
}
