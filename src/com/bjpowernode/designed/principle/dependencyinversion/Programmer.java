package com.bjpowernode.designed.principle.dependencyinversion;

public abstract class Programmer implements Human {
    @Override
    public void eat() {
        System.out.println("程序在吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("程序员在睡觉");
    }

    public abstract void work();
}
