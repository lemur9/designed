package com.bjpowernode.designed.pattern.behavioral.command;

public class BuyStock implements Order {

    private Stock aaaStock;

    public BuyStock(Stock aaaStock) {
        this.aaaStock = aaaStock;
    }

    @Override
    public void execute() {
        aaaStock.buy();
    }
}
