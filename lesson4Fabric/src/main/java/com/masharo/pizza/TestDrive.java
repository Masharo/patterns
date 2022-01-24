package com.masharo.pizza;

import com.masharo.pizza.stores.ChicagoPizzaStore;
import com.masharo.pizza.stores.NYPizzaStore;

public class TestDrive {
    public static void main(String[] args) {
        PizzaStore nYStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizzaNY = nYStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizzaNY.getName() + "\n");

        Pizza pizzaChicago = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizzaChicago.getName() + "\n");
    }
}
