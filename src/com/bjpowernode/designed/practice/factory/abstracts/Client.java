package com.bjpowernode.designed.practice.factory.abstracts;

import com.bjpowernode.designed.practice.factory.A;

public class Client {
    public static void main(String[] args) {
        Factory factory = new FactoryB();

        A obj = factory.getObj();
        System.out.println(obj.sing());
    }
}
