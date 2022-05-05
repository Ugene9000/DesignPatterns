package com.company.duck_simulator;

public class DuckCall {

    QuackBehavior quackBehavior;

    public DuckCall() {
        this.quackBehavior = new Quack();
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}

