package com.example.lesson1Strategy.ducks;

import com.example.lesson1Strategy.Duck;
import com.example.lesson1Strategy.flying.FlyNoWay;
import com.example.lesson1Strategy.quacking.Quack;

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
