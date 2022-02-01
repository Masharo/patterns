package com.masharo.pizza.pizzaChicago;

import com.masharo.pizza.Pizza;
import com.masharo.pizza.PizzaIngredientFactory;

@Deprecated
public class ChicagoStyleCheese extends Pizza {

    public ChicagoStyleCheese(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    @Override
    public void prepare() {

    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
