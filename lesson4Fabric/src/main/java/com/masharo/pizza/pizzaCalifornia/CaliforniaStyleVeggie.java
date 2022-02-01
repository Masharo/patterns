package com.masharo.pizza.pizzaCalifornia;

import com.masharo.pizza.Pizza;
import com.masharo.pizza.PizzaIngredientFactory;

@Deprecated
public class CaliforniaStyleVeggie extends Pizza {

    public CaliforniaStyleVeggie(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    @Override
    public void prepare() {

    }
}
