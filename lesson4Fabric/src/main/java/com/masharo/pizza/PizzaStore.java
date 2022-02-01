package com.masharo.pizza;

import com.masharo.pizza.ingredientFactory.NYPizzaIngredientFactory;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {

        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
