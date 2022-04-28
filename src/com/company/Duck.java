package com.company;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    protected void swim() {}

    protected void performQuack() {
        quackBehavior.quack();
    }

    protected void performFly() {
        flyBehavior.fly();
    }

    protected abstract void display();
}
