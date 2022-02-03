package com.masharo.lesson4Factory.factoryMethod.ChicagoPizzaStoreProduct;

import com.masharo.lesson4Factory.factoryMethod.Pizza;

public class ChicagoPizzaStyle extends Pizza {

    protected ChicagoPizzaStyle(String name, String sauce, String... toppings) {
        super(name, sauce, toppings);
        dough = "thick";
    }

    @Override
    public void bake()  {
        System.out.println("Bake for 30 minutes at 300");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
