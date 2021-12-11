package com.example.lesson1Fabric;

import com.example.lesson1Fabric.ducks.MallardDuck;
import com.example.lesson1Fabric.ducks.ModelDuck;
import com.example.lesson1Fabric.flying.FlyRocketPowered;

public class testDrive {

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
