package com.example.lesson1Fabric.quacking;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silents >>");
    }
}
