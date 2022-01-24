package com.masharo.pizza.stores;

import com.masharo.pizza.Pizza;
import com.masharo.pizza.PizzaStore;
import com.masharo.pizza.pizzaCalifornia.*;

public class CaliforniaPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new CaliforniaStyleCheese();
            case "clam":
                return new CaliforniaStyleClam();
            case "pepperoni":
                return new CaliforniaStylePepperoni();
            case "veggie":
                return new CaliforniaStyleVeggie();
        }

        return null;
    }
}
