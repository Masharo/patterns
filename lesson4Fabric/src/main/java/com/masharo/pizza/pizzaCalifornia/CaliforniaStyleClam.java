package com.masharo.pizza.pizzaCalifornia;

import com.masharo.pizza.Pizza;
import com.masharo.pizza.PizzaIngredientFactory;

@Deprecated
public class CaliforniaStyleClam extends Pizza {

    public CaliforniaStyleClam(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    @Override
    public void prepare() {

    }
}
