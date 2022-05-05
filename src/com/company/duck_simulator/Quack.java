package com.company.duck_simulator;

public class Quack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}
