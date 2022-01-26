package com.masharo.pizza.pizzaChicago;

import com.masharo.pizza.Pizza;
import com.masharo.pizza.ingredientFactory.PizzaIngredientFactory;

@Deprecated
public class ChicagoStyleClam extends Pizza {

    public ChicagoStyleClam(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    @Override
    public void prepare() {

    }
}
