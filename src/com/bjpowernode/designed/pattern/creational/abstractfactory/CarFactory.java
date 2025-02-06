package com.bjpowernode.designed.pattern.creational.abstractfactory;

interface CarFactory {

    //获取车门对象
    public CarDoor getCarDoor();

    //获取车架对象
    public CarFrame getCarFrame();

    //获取底盘对象
    public CarBasePlate getCarBasePlate();

    //制作汽车
    public void make();
}
