package com.bjpowernode.designed.practice.factory.abstracts;

import com.bjpowernode.designed.practice.factory.A;
import com.bjpowernode.designed.practice.factory.C;

public class FactoryA extends Factory {
    @Override
    public A getObj() {
        return new C();
    }
}
