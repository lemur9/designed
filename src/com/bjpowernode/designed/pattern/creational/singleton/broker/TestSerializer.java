package com.bjpowernode.designed.pattern.creational.singleton.broker;

import com.bjpowernode.designed.pattern.creational.singleton.doublechecked.DoubleCheckSingleton;
import com.bjpowernode.designed.pattern.creational.singleton.enumsingleton.EnumSingleton;
import com.bjpowernode.designed.pattern.creational.singleton.hungry.HungrySingleton;
import com.bjpowernode.designed.pattern.creational.singleton.lasy.LazySingleton;
import com.bjpowernode.designed.pattern.creational.singleton.staticinnerclass.StaticInnerClassSingleton;

import java.io.*;

public class TestSerializer {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //懒汉式
//        LazySingleton instance = LazySingleton.getInstance();
        //双重检查
        DoubleCheckSingleton instance = DoubleCheckSingleton.getInstance();
        //饿汉式
//        HungrySingleton instance = HungrySingleton.getInstance();
        //静态内部类
//        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
        //枚举
//        EnumSingleton instance = EnumSingleton.getInstance();

        //可以通过序列化和反序列化的方式,创建对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton"));
        oos.writeObject(instance);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("singleton")));

//        LazySingleton objInstance = (LazySingleton) ois.readObject();
        DoubleCheckSingleton objInstance = (DoubleCheckSingleton) ois.readObject();
//        HungrySingleton objInstance = (HungrySingleton) ois.readObject();
//        StaticInnerClassSingleton objInstance = (StaticInnerClassSingleton) ois.readObject();
//        EnumSingleton objInstance = (EnumSingleton) ois.readObject();

        System.out.println(instance);
        System.out.println(objInstance);
        System.out.println(instance == objInstance);


    }

}
