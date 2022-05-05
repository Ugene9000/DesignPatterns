package com.company.duck_simulator;

public class MakeNoSound implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Cannot quack");
    }
}
