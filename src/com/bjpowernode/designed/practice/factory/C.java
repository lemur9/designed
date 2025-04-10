package com.bjpowernode.designed.practice.factory;

public class C implements A {
    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "B{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
