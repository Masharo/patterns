package com.example.lesson1Strategy;

import com.example.lesson1Strategy.ducks.MallardDuck;
import com.example.lesson1Strategy.ducks.ModelDuck;
import com.example.lesson1Strategy.flying.FlyRocketPowered;

public class TestDrive {

    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        ModelDuck modelDuck = new ModelDuck();

        modelDuck.setFlyBehavior(new FlyRocketPowered());

        duckInfo(mallardDuck);
        duckInfo(modelDuck);
    }

    public static void duckInfo(Duck duck) {
        duck.display();
        duck.fly();
        duck.quack();
    }
}
