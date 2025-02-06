package com.bjpowernode.designed.principle.singleresponsibility;

public class JavaProgrammer extends Programmer {

    private Order order;

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public void work() {
        System.out.println("Java程序员在工作");
    }

    @Override
    public void eat() {
//        System.out.println("Java程序员在吃饭");
        order.take();
    }

    @Override
    public void sleep() {
        System.out.println("Java程序员在休息");
    }

//    public void orderTake(){
//        System.out.println("订外卖");
//    }
}
