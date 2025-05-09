package com.bjpowernode.designed.pattern.behavioral.visitor;

public interface ComputerPartVisitor {
    void visit(Keyboard keyboard);

    void visit(Mouse mouse);

    void visit(Monitor monitor);

    void visit(Computer computer);
}
