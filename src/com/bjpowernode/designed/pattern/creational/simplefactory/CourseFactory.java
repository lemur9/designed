package com.bjpowernode.designed.pattern.creational.simplefactory;

public class CourseFactory {

    public Course getCourse(String course){

        if("java".equalsIgnoreCase(course)){
            //创建Java课程对象,然后返回
            return new JavaCourse();
        }else if("python".equalsIgnoreCase(course)){
            //创建Python课程对象,然后返回
            return new PythonCourse();
        }

        return null;
    }

}
