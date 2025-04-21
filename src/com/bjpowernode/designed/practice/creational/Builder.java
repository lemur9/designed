package com.bjpowernode.designed.practice.creational;

public abstract class Builder {

    protected final Product product = new Product();

    public abstract void setName(String name);

    public abstract void setAge(int age);

    public abstract Product build();
}
