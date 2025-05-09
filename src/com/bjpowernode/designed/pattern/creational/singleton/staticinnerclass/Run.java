package com.bjpowernode.designed.pattern.creational.singleton.staticinnerclass;


public class Run implements Runnable {
    @Override
    public void run() {
        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+" "+instance);
    }
}
