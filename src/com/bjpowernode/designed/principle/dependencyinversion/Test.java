package com.bjpowernode.designed.principle.dependencyinversion;

public class Test {

    public static void main(String[] args) {
        JavaProgrammer programmer1 = new JavaProgrammer();
        programmer1.eat();
        programmer1.sleep();
        programmer1.work();

        TestProgrammer programmer2 = new TestProgrammer();
        programmer2.work();
    }
}
