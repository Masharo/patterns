package com.masharo.lesson4Factory.factoryMethod.pizzaStore;

import com.masharo.lesson4Factory.factoryMethod.ChicagoPizzaStoreProduct.ChicagoCheesePizza;
import com.masharo.lesson4Factory.factoryMethod.ChicagoPizzaStoreProduct.ChicagoClamPizza;
import com.masharo.lesson4Factory.factoryMethod.ChicagoPizzaStoreProduct.ChicagoPepperoniPizza;
import com.masharo.lesson4Factory.factoryMethod.ChicagoPizzaStoreProduct.ChicagoVeggiePizza;
import com.masharo.lesson4Factory.factoryMethod.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(TypePizza typePizza) {

        switch (typePizza) {
            case CHEESE:
                return new ChicagoCheesePizza();
            case VEGGIE:
                return new ChicagoVeggiePizza();
            case CLAM:
                return new ChicagoClamPizza();
            case PEPPERONI:
                return new ChicagoPepperoniPizza();
        }

        return null;
    }
}
