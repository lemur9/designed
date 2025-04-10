package com.bjpowernode.designed.practice.singleton.statics;

/**
 * 懒汉式
 */
public class Singleton {
    private Singleton() {
    }

    public static Singleton getUniqueInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
}
