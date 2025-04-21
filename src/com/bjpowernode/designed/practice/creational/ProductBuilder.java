package com.bjpowernode.designed.practice.creational;

public class ProductBuilder extends Builder {

    @Override
    public void setName(String name) {
        product.setName(name);
    }

    @Override
    public void setAge(int age) {
        product.setAge(age);
    }

    public Product build() {
        return product;
    }
}
