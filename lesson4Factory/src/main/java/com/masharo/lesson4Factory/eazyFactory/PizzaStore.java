package com.masharo.lesson4Factory.eazyFactory;

import com.masharo.lesson4Factory.eazyFactory.pizza.*;

import java.util.Objects;

public class PizzaStore {

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

    private Pizza createPizza(TypePizza typePizza) {
        switch (typePizza) {
            case CHEESE:
                return new CheesePizza();
            case CLAM:
                return new ClamPizza();
            case PEPPERONI:
                return new PepperoniPizza();
            case VEGGIE:
                return new VeggiePizza();
            default:
                return null;
        }
    }
}
