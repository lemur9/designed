package com.bjpowernode.designed.practice.factory.abstracts;

import com.bjpowernode.designed.practice.factory.A;
import com.bjpowernode.designed.practice.factory.B;

public class FactoryB extends Factory {
    @Override
    public A getObj() {
        return new B();
    }
}
