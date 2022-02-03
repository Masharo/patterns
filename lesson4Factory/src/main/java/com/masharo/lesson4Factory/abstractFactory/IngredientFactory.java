package com.masharo.lesson4Factory.abstractFactory;

import com.masharo.lesson4Factory.abstractFactory.ingredients.*;
import com.masharo.lesson4Factory.abstractFactory.ingredients.Cheese;

public interface IngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clam createClams();

}
