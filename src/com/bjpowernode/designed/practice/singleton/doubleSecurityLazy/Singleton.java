package com.bjpowernode.designed.practice.singleton.doubleSecurityLazy;

/**
 * 懒汉式
 */
public class DoubleSingleton {
    private DoubleSingleton() {
    }

    private static DoubleSingleton singleton;


    public static DoubleSingleton getHungry() {
        synchronized (new Object()) {
            if (singleton == null) {
                synchronized (new Object()) {
                    singleton = new DoubleSingleton();
                }
            }
        }
        return singleton;
    }
}
