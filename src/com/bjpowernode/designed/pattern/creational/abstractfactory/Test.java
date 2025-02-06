package com.bjpowernode.designed.pattern.creational.abstractfactory;

public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        car.getCarBasePlate();
        car.getCarDoor();
        car.getCarFrame();
        car.make();
    }
}
