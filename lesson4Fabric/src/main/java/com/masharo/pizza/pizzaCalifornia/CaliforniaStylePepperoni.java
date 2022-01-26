package com.masharo.pizza.pizzaCalifornia;

import com.masharo.pizza.Pizza;
import com.masharo.pizza.ingredientFactory.PizzaIngredientFactory;

@Deprecated
public class CaliforniaStylePepperoni extends Pizza {

    public CaliforniaStylePepperoni(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    @Override
    public void prepare() {

    }
}
