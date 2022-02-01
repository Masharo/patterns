package com.masharo.pizza.stores;

import com.masharo.pizza.Pizza;
import com.masharo.pizza.PizzaStore;
import com.masharo.pizza.ingredientFactory.NYPizzaIngredientFactory;
import com.masharo.pizza.PizzaIngredientFactory;
import com.masharo.pizza.pizza.CheesePizza;
import com.masharo.pizza.pizza.ClamPizza;
import com.masharo.pizza.pizza.PepperoniPizza;
import com.masharo.pizza.pizza.VeggiePizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {

        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        switch (type) {
            case "cheese":
                return new CheesePizza(ingredientFactory);
            case "clam":
                return new ClamPizza(ingredientFactory);
            case "pepperoni":
                return new PepperoniPizza(ingredientFactory);
            case "veggie":
                return new VeggiePizza(ingredientFactory);
        }

        return null;
    }
}
