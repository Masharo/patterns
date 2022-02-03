package com.masharo.lesson4Factory.factoryMethod;

import com.masharo.lesson4Factory.factoryMethod.pizzaStore.ChicagoPizzaStore;
import com.masharo.lesson4Factory.factoryMethod.pizzaStore.NYPizzaStore;
import com.masharo.lesson4Factory.factoryMethod.pizzaStore.PizzaStore;

public class TestDrive {

    public static void main(String[] args) throws Exception {
        PizzaStore pizzaNY = new NYPizzaStore();
        PizzaStore pizzaChicago = new ChicagoPizzaStore();

        Pizza pizzaJoel = pizzaNY.orderPizza(PizzaStore.TypePizza.CHEESE);
        System.out.println("Joel ordered a " + pizzaJoel.getName() + "\n");

        Pizza pizzaEthan = pizzaChicago.orderPizza(PizzaStore.TypePizza.PEPPERONI);
        System.out.println("Ethan ordered a " + pizzaEthan.getName() + "\n");
    }
}
