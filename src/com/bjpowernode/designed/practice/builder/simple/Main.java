package com.bjpowernode.designed.practice.builder.simple;

public class Main {

    public static void main(String[] args) {
        Client.Builder builder = new Client.Builder();
        Client lemur = builder.age(1).name("lemur").build();
        System.out.println(lemur);
    }
}
