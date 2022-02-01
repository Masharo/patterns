package com.masharo.pizza.pizzaNY;

import com.masharo.pizza.Pizza;
import com.masharo.pizza.PizzaIngredientFactory;

@Deprecated
public class NYStyleVeggie extends Pizza {

    public NYStyleVeggie(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    @Override
    public void prepare() {

    }
}
