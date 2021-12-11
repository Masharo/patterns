package com.example.lesson1Fabric.ducks;

import com.example.lesson1Fabric.Duck;
import com.example.lesson1Fabric.flying.FlyNoWay;
import com.example.lesson1Fabric.quacking.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        paintDuck();
        helloDuck("model");
    }
}
