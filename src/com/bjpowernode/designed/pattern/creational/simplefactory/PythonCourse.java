package com.bjpowernode.designed.pattern.creational.simplefactory;

public class PythonCourse extends Course {

    @Override
    public void make() {
        System.out.println("制作Python课程");
    }
}
