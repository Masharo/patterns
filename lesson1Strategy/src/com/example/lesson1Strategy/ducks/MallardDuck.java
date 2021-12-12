package com.example.lesson1Strategy.ducks;

import com.example.lesson1Strategy.Duck;
import com.example.lesson1Strategy.flying.FlyWithWings;
import com.example.lesson1Strategy.quacking.Quack;

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
