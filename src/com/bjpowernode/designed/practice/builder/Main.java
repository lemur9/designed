package com.bjpowernode.designed.practice.builder;

public class Main {
    public static void main(String[] args) {
        Engineer engineer = new Engineer(new ClientBuilder());
        System.out.println(engineer.make(1,"lemur"));
    }
}
