package com.bjpowernode.designed.pattern.structural.bridge;

public class Pen extends Tools {

    private Shape shape;

    public Pen(Shape shape) {
        super(shape);
        this.shape = shape;
    }

    @Override
    public void use() {
        shape.draw(" 钢笔 ");
    }
}
