package com.bjpowernode.designed.pattern.structural.proxy.dynamicproxy;

public class OrderDaoImpl implements OrderDao {
    @Override
    public int insert(Order order) {
        System.out.println("持久层...保存订单信息..."+order);
        return 1;
    }
}
