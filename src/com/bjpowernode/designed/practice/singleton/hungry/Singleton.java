package com.bjpowernode.designed.practice.singleton.hungry;

/**
 * 饿汉式
 */
public class Singleton {
    private Singleton() {}

    private static final Singleton singleton = new Singleton();

    public Singleton getHungry() {
        return singleton;
    }
}
