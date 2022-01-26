package com.masharo.pizza.pizza;

import com.masharo.pizza.Pizza;
import com.masharo.pizza.ingredientFactory.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    @Override
    public void prepare() {

    }
}
