package com.example.lesson1Fabric.ducks;

import com.example.lesson1Fabric.Duck;
import com.example.lesson1Fabric.flying.FlyWithWings;
import com.example.lesson1Fabric.quacking.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        paintDuck();
        helloDuck("millard");
    }
}
