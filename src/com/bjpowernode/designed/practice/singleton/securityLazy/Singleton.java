package com.bjpowernode.designed.practice.singleton.securityLazy;

/**
 * 懒汉式
 */
public class Singleton {
    private Singleton() {}

    private Singleton singleton;

    public Singleton getHungry() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
