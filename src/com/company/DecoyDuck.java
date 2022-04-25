package com.company;

import java.util.Dictionary;

public class DecoyDuck extends Duck {
    @Override
    protected void quack() {
        System.out.println("N/A");
    }

    @Override
    protected void fly() {
        System.out.println("N/A");
    }

    @Override
    protected void display() {
        System.out.println("looks like decoy duck");
    }
}
