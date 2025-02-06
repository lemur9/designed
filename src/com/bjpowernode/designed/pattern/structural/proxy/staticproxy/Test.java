package com.bjpowernode.designed.pattern.structural.proxy.staticproxy;

public class Test {

    public static void main(String[] args) {
        Order order = new Order();
        order.setInfo("订单信息,购买Iphone100X");
        order.setUserId("1");

        OrderServiceImplStaticProxy proxy = new OrderServiceImplStaticProxy();
        proxy.saveOrder(order);
    }
}
