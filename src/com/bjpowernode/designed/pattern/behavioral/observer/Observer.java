package com.bjpowernode.designed.pattern.behavioral.observer;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
