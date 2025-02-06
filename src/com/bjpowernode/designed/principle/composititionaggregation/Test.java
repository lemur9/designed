package com.bjpowernode.designed.principle.composititionaggregation;

public class Test {

    public static void main(String[] args) {

        //老师让学生通知家长,开家长会
//        Teacher teacher = new Teacher();
//        teacher.call();
//        Student student = new Student();
//        student.notifyMetting();
//        Parent parent = new Parent();
//        parent.metting();

        //可以采用微信或电话的方式,通知家长,开家长会
        //而不用通过学生进行转达
        Teacher teacher = new Teacher();

//        WxNotify wxNotify = new WxNotify();
        PhoneNotify phoneNotify = new PhoneNotify();

        teacher.setNotify(phoneNotify);
        Parent parent = new Parent();
//        wxNotify.setParent(parent);
        phoneNotify.setParent(parent);
        teacher.call();



    }
}
