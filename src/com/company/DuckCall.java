package com.company;

public class DuckCall {

    QuackBehavior quackBehavior;

    public DuckCall() {
        this.quackBehavior = new Quack();
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}

