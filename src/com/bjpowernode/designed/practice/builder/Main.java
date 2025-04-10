package com.bjpowernode.designed.practice.builder;

public class Main {

    public static void main(String[] args) {
        Client lemur = new ClientBuilder().age(12).name("lemur").build();
        System.out.println(lemur);
    }
}
