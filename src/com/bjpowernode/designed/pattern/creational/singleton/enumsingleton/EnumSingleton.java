package com.bjpowernode.designed.pattern.creational.singleton.enumsingleton;

public enum EnumSingleton {

    INSTANCE;

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }

}
