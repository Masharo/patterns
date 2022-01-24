package com.masharo.pizza.pizzaChicago;

import com.masharo.pizza.Pizza;

public class ChicagoStyleCheese extends Pizza {

    public ChicagoStyleCheese() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
