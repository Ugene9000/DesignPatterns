package com.company;

public class A extends Duck{

    public A() {
        flyBehavior = new FlyNoWay();
    }

    @Override
    protected void display() {

    }
}
