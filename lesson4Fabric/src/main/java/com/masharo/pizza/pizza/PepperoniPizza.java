package com.masharo.pizza.pizza;

import com.masharo.pizza.Pizza;
import com.masharo.pizza.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    @Override
    public void prepare() {

    }
}
