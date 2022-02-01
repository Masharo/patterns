package com.masharo.pizza.pizzaNY;

import com.masharo.pizza.Pizza;
import com.masharo.pizza.PizzaIngredientFactory;

@Deprecated
public class NYStyleCheese extends Pizza {

    public NYStyleCheese(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    @Override
    public void prepare() {

    }
}
