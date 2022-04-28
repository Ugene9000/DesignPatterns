package com.company;

public class MakeNoSound implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Cannot quack");
    }
}
