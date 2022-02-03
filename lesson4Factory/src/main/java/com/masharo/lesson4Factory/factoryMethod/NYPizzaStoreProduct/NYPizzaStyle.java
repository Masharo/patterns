package com.masharo.lesson4Factory.factoryMethod.NYPizzaStoreProduct;

import com.masharo.lesson4Factory.factoryMethod.Pizza;

public class NYPizzaStyle extends Pizza {

    protected NYPizzaStyle(String name, String sauce, String... toppings) {
        super(name, sauce, toppings);
        dough = "thin";
    }

    @Override
    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }
}
