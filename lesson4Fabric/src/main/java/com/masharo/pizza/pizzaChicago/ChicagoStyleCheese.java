package com.masharo.pizza.pizzaChicago;

import com.masharo.pizza.Pizza;

public class ChicagoStyleCheese extends Pizza {

    public ChicagoStyleCheese() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
