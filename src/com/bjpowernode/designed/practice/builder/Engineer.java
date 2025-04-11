package com.bjpowernode.designed.practice.builder;

public class Engineer {

    private ClientBuilder clientBuilder;

    public Engineer(ClientBuilder clientBuilder) {
        this.clientBuilder = clientBuilder;
    }

    public Client make (int age, String name) {
        clientBuilder.age(age);
        clientBuilder.name(name);
       return clientBuilder.build();
    }
}
