package com.bjpowernode.designed.pattern.structural.bridge;

public class Pencil extends Tools {

    private Shape shape;

    public Pencil(Shape shape) {
        super(shape);
        this.shape  = shape;
    }

    @Override
    public void use() {
        shape.draw(" 铅笔 ");
    }
}
