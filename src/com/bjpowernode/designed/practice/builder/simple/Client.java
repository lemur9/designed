package com.bjpowernode.designed.practice.builder.simple;

public class Client {

    private String name;

    private int age;

    public static Builder builder() {
        return new Builder();
    }

    private Client(Builder builder) {
        this.age = builder.age;
        this.name = builder.name;
    }

    public static class Builder {
        private String name;

        private int age;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Client build() {
            return new Client(this);
        }
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
