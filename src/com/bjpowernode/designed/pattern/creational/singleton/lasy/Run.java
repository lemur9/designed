package com.bjpowernode.designed.pattern.creational.singleton.lasy;

public class Run implements Runnable {
    @Override
    public void run(){
        LazySingleton instance = LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+" "+instance+"");
    }
}
