package com.masharo.pizza.pizzaChicago;

import com.masharo.pizza.Pizza;
import com.masharo.pizza.PizzaIngredientFactory;

@Deprecated
public class ChicagoStylePepperoni extends Pizza {

    public ChicagoStylePepperoni(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    @Override
    public void prepare() {

    }
}
