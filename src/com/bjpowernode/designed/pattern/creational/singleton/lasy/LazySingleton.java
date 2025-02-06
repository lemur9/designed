package com.bjpowernode.designed.pattern.creational.singleton.lasy;


import java.io.Serializable;

public class LazySingleton implements Serializable {

    private static LazySingleton lazySingleton = null;

    private LazySingleton() {
        if(lazySingleton == null){
            throw new RuntimeException("不允许通过反射,创建单例对象");
        }
    }

    public static synchronized LazySingleton getInstance() {

        if(lazySingleton == null)
            lazySingleton = new LazySingleton();

        return lazySingleton;
    }

    private Object readResolve(){
        return lazySingleton;
    }

}
