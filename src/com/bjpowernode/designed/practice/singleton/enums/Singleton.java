package com.bjpowernode.designed.practice.singleton.enums;

public enum Singleton {
    SINGLETON;

    public static Singleton getInstance() {
        return SINGLETON;
    }

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
    }
}
