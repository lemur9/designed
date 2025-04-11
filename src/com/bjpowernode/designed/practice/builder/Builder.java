package com.bjpowernode.designed.practice.builder;

public interface Builder {

    void age(int i);

    void name(String lemur);

    Client build();
}
