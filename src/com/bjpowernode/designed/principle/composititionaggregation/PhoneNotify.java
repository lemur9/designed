package com.bjpowernode.designed.principle.composititionaggregation;

public class PhoneNotify implements Notify {

    private Parent parent;

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public void phoneNotify(){
        parent.metting();
    }

}
