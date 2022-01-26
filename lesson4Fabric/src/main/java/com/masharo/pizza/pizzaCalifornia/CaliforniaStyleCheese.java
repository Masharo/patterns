package com.masharo.pizza.pizzaCalifornia;

import com.masharo.pizza.Pizza;
import com.masharo.pizza.ingredientFactory.PizzaIngredientFactory;

@Deprecated
public class CaliforniaStyleCheese extends Pizza {

    public CaliforniaStyleCheese(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    @Override
    public void prepare() {

    }
}
