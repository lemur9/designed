package com.bjpowernode.designed.principle.composititionaggregation;

public class Teacher {

    private Notify notify;

    public void setNotify(Notify notify) {
        this.notify = notify;
    }

    public void call(){
//        System.out.println("小明,通知你的家长,在这周末,开家长会");

        if(notify instanceof WxNotify){
            System.out.println("使用微信通知家长");
            ((WxNotify) notify).wxNotify();
        }else if (notify instanceof PhoneNotify ){
            System.out.println("使用电话通知家长");
            ((PhoneNotify) notify).phoneNotify();
        }
    }


}
