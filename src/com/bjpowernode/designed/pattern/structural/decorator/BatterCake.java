package com.bjpowernode.designed.pattern.structural.decorator;

public class BatterCake extends ABatterCake {
    @Override
    protected String getInfo() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 6;
    }
}
