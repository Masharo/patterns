package com.masharo.pizza.stores;

import com.masharo.pizza.Pizza;
import com.masharo.pizza.PizzaStore;
import com.masharo.pizza.pizzaNY.*;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {

        switch (type) {
            case "cheese":
                return new NYStyleCheese();
            case "clam":
                return new NYStyleClam();
            case "pepperoni":
                return new NYStylePepperoni();
            case "veggie":
                return new NYStyleVeggie();
        }

        return null;
    }
}
