package com.bjpowernode.designed.pattern.creational.prototype;

public class Pig implements Cloneable {

    public Pig() {
        System.out.println("小猪被初始化了...");
    }

    private String name;
    private String doSomething;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", doSomething='" + doSomething + '\'' +
                '}'+super.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDoSomething() {
        return doSomething;
    }

    public void setDoSomething(String doSomething) {
        this.doSomething = doSomething;
    }
}
