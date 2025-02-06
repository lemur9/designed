package com.bjpowernode.designed.pattern.creational.singleton.hungry;

import java.io.Serializable;

public class HungrySingleton implements Serializable {

//    private static HungrySingleton hungrySingleton = null;
    private static HungrySingleton hungrySingleton = new HungrySingleton();

//    static {
//        hungrySingleton = new HungrySingleton();
//    }


    private HungrySingleton() {
        if(hungrySingleton == null){
            throw new RuntimeException("不允许通过反射,创建单例对象");
        }
    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    private Object readResolve(){
        return hungrySingleton;
    }
}
