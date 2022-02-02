package com.masharo.lesson4Factory.eazyFactory;

import com.masharo.lesson4Factory.eazyFactory.pizza.Pizza;

public class TestDrive {

    public static void main(String[] args) throws Exception {
        PizzaStore pizza = new PizzaStore();

        Pizza pizzaJoel = pizza.orderPizza(PizzaStore.TypePizza.CHEESE);
        System.out.println("Joel ordered a " + pizzaJoel.getName() + "\n");

        Pizza pizzaEthan = pizza.orderPizza(PizzaStore.TypePizza.PEPPERONI);
        System.out.println("Ethan ordered a " + pizzaEthan.getName() + "\n");
    }
}
