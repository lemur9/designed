package com.bjpowernode.designed.practice.builder;

public class ClientBuilder {
    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public ClientBuilder name(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public ClientBuilder age(int age) {
        this.age = age;
        return this;
    }

    public Client build() {
        Client client = new Client();
        client.setName(getName());
        client.setAge(getAge());
        return client;
    }
}
