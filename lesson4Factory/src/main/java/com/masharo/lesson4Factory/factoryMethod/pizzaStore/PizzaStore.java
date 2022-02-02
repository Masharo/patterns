package com.masharo.lesson4Factory.factoryMethod.pizzaStore;

import com.masharo.lesson4Factory.factoryMethod.Pizza;

import java.util.Objects;

public abstract class PizzaStore {

    public Pizza orderPizza(TypePizza typePizza) throws Exception {

        Pizza pizza = createPizza(typePizza);

        if (Objects.nonNull(pizza)) {

            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();

            return pizza;
        }

        throw new Exception("Exception: createPizza returned null");
    }

    public enum TypePizza {
        CHEESE,
        CLAM,
        PEPPERONI,
        VEGGIE
    }

    protected abstract Pizza createPizza(TypePizza typePizza);
}
