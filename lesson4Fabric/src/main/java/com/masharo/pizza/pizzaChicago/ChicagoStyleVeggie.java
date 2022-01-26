package com.masharo.pizza.pizzaChicago;

import com.masharo.pizza.Pizza;
import com.masharo.pizza.ingredientFactory.PizzaIngredientFactory;

@Deprecated
public class ChicagoStyleVeggie extends Pizza {

    public ChicagoStyleVeggie(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    @Override
    public void prepare() {

    }
}
