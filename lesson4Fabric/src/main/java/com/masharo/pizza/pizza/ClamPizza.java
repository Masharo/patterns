package com.masharo.pizza.pizza;

import com.masharo.pizza.Pizza;
import com.masharo.pizza.PizzaIngredientFactory;

public class ClamPizza extends Pizza {

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    @Override
    public void prepare() {

    }
}
