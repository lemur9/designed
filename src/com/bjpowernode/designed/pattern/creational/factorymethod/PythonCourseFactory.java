package com.bjpowernode.designed.pattern.creational.factorymethod;

public class PythonCourseFactory extends CourseFactory {
    @Override
    public Course getCourse() {
        return new PythonCourse();
    }
}
