package com.masharo.lesson4Factory.factoryMethod.pizzaStore;

import com.masharo.lesson4Factory.factoryMethod.NYPizzaStoreProduct.NYCheesePizza;
import com.masharo.lesson4Factory.factoryMethod.NYPizzaStoreProduct.NYClamPizza;
import com.masharo.lesson4Factory.factoryMethod.NYPizzaStoreProduct.NYPepperoniPizza;
import com.masharo.lesson4Factory.factoryMethod.NYPizzaStoreProduct.NYVeggiePizza;
import com.masharo.lesson4Factory.factoryMethod.Pizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(TypePizza typePizza) {

        switch (typePizza) {
            case CHEESE:
                return new NYCheesePizza();
            case CLAM:
                return new NYClamPizza();
            case PEPPERONI:
                return new NYPepperoniPizza();
            case VEGGIE:
                return new NYVeggiePizza();
        }

        return null;
    }
}
