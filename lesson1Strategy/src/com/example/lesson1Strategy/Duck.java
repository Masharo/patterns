package com.example.lesson1Strategy;

import com.example.lesson1Strategy.flying.FlyBehavior;
import com.example.lesson1Strategy.quacking.QuackBehavior;

public abstract class Duck {

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void fly() {
        flyBehavior.fly();
    }

    public void quack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("I swimming");
    }

    protected void paintDuck() {
        System.out.println(
                "\n" +
                        "___________$$$$$$\n" +
                        "___________$$_____$$\n" +
                        "__________$__(•)____$$\n" +
                        "________$$__________$\n" +
                        "___________$$_____$\n" +
                        "___________$____$\n" +
                        "_________$____$__$$$__$$______$\n" +
                        "_______$$_____$_____$$__$$__$$$\n" +
                        "_______$______$___________$$__$\n" +
                        "_______$$_______$______$$_____$\n" +
                        "_______$$________$$$$$$______$\n" +
                        "________$$$________________$\n" +
                        "__________$$$$__________$$\n" +
                        "____________$$$$$$$$$$$$\n" +
                        "?“????????“?¤\n" +
                        "……......¤?“????????“?¤...¤?“????????“?¤...... ");
    }

    protected void helloDuck(String name) {
        System.out.println("\nI'm a mallard duck\n");
    }

    public abstract void display();
}
