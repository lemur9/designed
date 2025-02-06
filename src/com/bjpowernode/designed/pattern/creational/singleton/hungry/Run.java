package com.bjpowernode.designed.pattern.creational.singleton.hungry;

import com.bjpowernode.designed.pattern.creational.singleton.doublechecked.DoubleCheckSingleton;

public class Run implements Runnable {
    @Override
    public void run() {
        HungrySingleton instance = HungrySingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+" "+instance);
    }
}
