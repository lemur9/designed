package com.bjpowernode.designed.practice.creational;

public class Director {
    private final Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Product construct(String name, int age) {
        builder.setName(name);
        builder.setAge(age);
        return builder.build();
    }
}
