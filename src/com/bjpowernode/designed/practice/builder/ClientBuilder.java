package com.bjpowernode.designed.practice.builder;

public class ClientBuilder implements Builder {

    public Client client = new Client();

    public Client build() {
        return client;
    }

    public void age(int i) {
        client.setAge(i);
    }

    public void name(String lemur) {
        client.setName(lemur);
    }
}
