package com.masharo.pizza.pizza;

import com.masharo.pizza.Pizza;
import com.masharo.pizza.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    @Override
    public void prepare() {

    }
}
