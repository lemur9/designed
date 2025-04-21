package com.bjpowernode.designed.practice.creational;

public class Client {
    public static void main(String[] args) {
        Director director = new Director(new ProductBuilder());

        Product construct = director.construct("lemur",20);
        System.out.println(construct);
    }
}
