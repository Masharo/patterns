package com.example.lesson1Strategi.ducks;

import com.example.lesson1Strategi.Duck;
import com.example.lesson1Strategi.flying.FlyNoWay;
import com.example.lesson1Strategi.quacking.Quack;

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
