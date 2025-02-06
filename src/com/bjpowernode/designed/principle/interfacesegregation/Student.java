package com.bjpowernode.designed.principle.interfacesegregation;

public class Student implements EatAction,SleepAction,SwimAction {
    @Override
    public void eat() {
        System.out.println("学生在吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("学生在休息");
    }

    @Override
    public void swim() {
        System.out.println("学生学习游泳技巧");
    }
}
