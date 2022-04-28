package com.company;

import java.util.Dictionary;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new MakeNoSound();
    }

    @Override
    protected void display() {
        System.out.println("looks like decoy duck");
    }
}
