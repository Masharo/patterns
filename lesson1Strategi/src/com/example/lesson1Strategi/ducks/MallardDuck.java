package com.example.lesson1Strategi.ducks;

import com.example.lesson1Strategi.Duck;
import com.example.lesson1Strategi.flying.FlyWithWings;
import com.example.lesson1Strategi.quacking.Quack;

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
