package com.example.lesson1Strategi;

import com.example.lesson1Strategi.ducks.MallardDuck;
import com.example.lesson1Strategi.ducks.ModelDuck;
import com.example.lesson1Strategi.flying.FlyRocketPowered;

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
