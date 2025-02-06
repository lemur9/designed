package com.bjpowernode.designed.principle.openclose;

public class HighSchoolStudent extends Student {

    @Override
    public void eat() {
        System.out.println("高中生在吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("高中生在睡觉");
    }

    @Override
    public void study() {
        System.out.println("高中生在学习");
    }

    public void doSomeThing(){
        System.out.println("我是一个高中生");
    }
}
