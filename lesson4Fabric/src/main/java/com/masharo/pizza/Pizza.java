package com.masharo.pizza;

import com.masharo.pizza.ingredient.*;

import java.util.ArrayList;

public abstract class Pizza {

    protected Dough dough;
    protected Sauce sauce;
    protected Cheese cheese;
    protected Veggies[] veggies;
    protected Pepperoni pepperoni;
    protected Clams clams;

    protected String name;

    protected ArrayList<String> toppings;

    public Pizza() {
        this.toppings = new ArrayList<>();
    }

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
