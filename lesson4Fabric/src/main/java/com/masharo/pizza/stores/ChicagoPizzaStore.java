package com.masharo.pizza.stores;

import com.masharo.pizza.Pizza;
import com.masharo.pizza.PizzaStore;
import com.masharo.pizza.pizzaChicago.*;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new ChicagoStyleCheese();
            case "clam":
                return new ChicagoStyleClam();
            case "pepperoni":
                return new ChicagoStylePepperoni();
            case "veggie":
                return new ChicagoStyleVeggie();
        }

        return null;
    }
}
