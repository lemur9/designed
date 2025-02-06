package com.bjpowernode.designed.pattern.creational.singleton.doublechecked;

import com.bjpowernode.designed.pattern.creational.singleton.lasy.LazySingleton;

public class Run implements Runnable {
    @Override
    public void run() {
        DoubleCheckSingleton instance = DoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+" "+instance);
    }
}
