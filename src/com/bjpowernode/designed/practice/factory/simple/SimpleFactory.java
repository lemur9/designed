package com.bjpowernode.designed.practice.factory.simple;

import com.bjpowernode.designed.practice.factory.A;
import com.bjpowernode.designed.practice.factory.B;
import com.bjpowernode.designed.practice.factory.C;
import com.bjpowernode.designed.practice.factory.D;

public class SimpleFactory {

    public static A get(String clazz) {
        return switch (clazz) {
            case "B" -> new B();
            case "C" -> new C();
            default -> new D();
        };
    }

    public static void main(String[] args) {
        A a1 = SimpleFactory.get("B");
        System.out.println(a1.sing());

        A a2 = SimpleFactory.get("C");
        System.out.println(a2.sing());
    }
}
