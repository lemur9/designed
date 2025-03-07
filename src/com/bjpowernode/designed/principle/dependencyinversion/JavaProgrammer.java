package com.bjpowernode.designed.principle.dependencyinversion;

public class JavaProgrammer extends Programmer {

    @Override
    public void eat() {
        System.out.println("Java程序员在吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("Java程序员在睡觉");
    }

    @Override
    public void work() {
        System.out.println("Java程序员在工作");
    }
}
