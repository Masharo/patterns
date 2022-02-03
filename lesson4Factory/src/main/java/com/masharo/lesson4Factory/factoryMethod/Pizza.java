package com.masharo.lesson4Factory.factoryMethod;

import java.util.Arrays;
import java.util.List;

public abstract class Pizza {

    protected String name,
            dough,
            sauce;

    protected List<String> toppings;

    protected Pizza(String name, String sauce, String... toppings) {
        this.name = name;
        this.sauce = sauce;
        this.toppings = Arrays.asList(toppings);
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (String topping : toppings) {
            System.out.println(" " + topping);
        }
    }

    public abstract void bake();

    public abstract void cut();

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}