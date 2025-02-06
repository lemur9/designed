package com.bjpowernode.designed.pattern.creational.factorymethod;

public class JavaCourseFactory extends CourseFactory {
    @Override
    public Course getCourse() {
        return new JavaCourse();
    }
}