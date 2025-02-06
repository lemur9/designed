package com.bjpowernode.designed.pattern.creational.singleton.broker;

import com.bjpowernode.designed.pattern.creational.singleton.enumsingleton.EnumSingleton;
import com.bjpowernode.designed.pattern.creational.singleton.hungry.HungrySingleton;
import com.bjpowernode.designed.pattern.creational.singleton.lasy.LazySingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestReflect {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        //创建字节码对象,以懒加载的单例模式为例
//        Class clz = LazySingleton.class;
        Class clz = HungrySingleton.class;
        //单例模式一共5种,懒汉式,饿汉式,静态内部类,双重检查,枚举
//        Class clz = EnumSingleton.class;

        //创建构造器对象
        Constructor constructor = clz.getDeclaredConstructor();

        //枚举类型的单例模式,在创建构造方法时,需要给两个参数
        //该参数是源码中体现的,一个是string,int
        //Cannot reflectively create enum objects
        //在使用枚举时,通过反射创建单例对象时,是不允许创建的,会抛出异常
        //在其他的单例模式中也可以模拟这种实现方式,不允许通过反射创建
//        Constructor constructor = clz.getDeclaredConstructor(String.class,int.class);

        //赋予权限
        constructor.setAccessible(true);

        //初始化,单例对象,注意私有构造的问题
//        LazySingleton clzInstance = (LazySingleton) constructor.newInstance();
        HungrySingleton clzInstance = (HungrySingleton) constructor.newInstance();
//        EnumSingleton clzInstance = (EnumSingleton) constructor.newInstance("bjpowernode",666);

//        LazySingleton instance = LazySingleton.getInstance();
        HungrySingleton instance = HungrySingleton.getInstance();
//        EnumSingleton instance = EnumSingleton.getInstance();

        System.out.println(instance);

        System.out.println(clzInstance);

        System.out.println(instance == clzInstance);

    }
}
