package com.masharo.lesson4Factory.factoryMethod.ChicagoPizzaStoreProduct;

import com.masharo.lesson4Factory.eazyFactory.pizza.Pizza;

public class ChicagoPizzaStyle extends Pizza {

    protected ChicagoPizzaStyle(String name, String... toppings) {
        super(name, toppings);
    }
}
