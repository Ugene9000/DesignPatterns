package com.company;

public class RubberDuck extends Duck{
    @Override
    protected void display() {
        System.out.println("looks like rubber duck");
    }

    @Override
    protected void performQuack() {
        System.out.println("overridden to squeak");
    }
}
