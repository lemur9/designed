package com.bjpowernode.designed.pattern.creational.factorymethod;

public class Test {

    public static void main(String[] args) {

        JavaCourseFactory javaCourseFactory = new JavaCourseFactory();
        Course javaCourse = javaCourseFactory.getCourse();
        javaCourse.make();

        PythonCourseFactory pythonCourseFactory = new PythonCourseFactory();
        Course pythonCourse = pythonCourseFactory.getCourse();
        pythonCourse.make();

    }
}
