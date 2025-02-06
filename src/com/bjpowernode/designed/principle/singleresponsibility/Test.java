package com.bjpowernode.designed.principle.singleresponsibility;

public class Test {

    public static void main(String[] args) {
//        JavaProgrammer programmer = new JavaProgrammer();
//        programmer.eat();
//        programmer.orderTake();
//        programmer.sleep();
//        programmer.work();

        JavaProgrammer programmer = new JavaProgrammer();
        Order order = new Order();
        programmer.setOrder(order);
        programmer.eat();
        programmer.work();
        programmer.sleep();

    }
}
