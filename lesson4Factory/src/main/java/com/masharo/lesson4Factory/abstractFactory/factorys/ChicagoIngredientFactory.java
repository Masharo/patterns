package com.masharo.lesson4Factory.abstractFactory.factorys;

import com.masharo.lesson4Factory.abstractFactory.IngredientFactory;
import com.masharo.lesson4Factory.abstractFactory.ingredients.*;
import com.masharo.lesson4Factory.abstractFactory.ingredients.Cheese;
import com.masharo.lesson4Factory.abstractFactory.ingredients.cheese.Cheddar;
import com.masharo.lesson4Factory.abstractFactory.ingredients.clam.FrozenClam;
import com.masharo.lesson4Factory.abstractFactory.ingredients.dough.ThickDough;
import com.masharo.lesson4Factory.abstractFactory.ingredients.pepperoni.PepperoniClassic;
import com.masharo.lesson4Factory.abstractFactory.ingredients.sauce.GarlicSauce;
import com.masharo.lesson4Factory.abstractFactory.ingredients.veggie.Pineapple;
import com.masharo.lesson4Factory.abstractFactory.ingredients.veggie.Tomato;

public class ChicagoIngredientFactory implements IngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickDough();
    }

    @Override
    public Sauce createSauce() {
        return new GarlicSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Cheddar();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[] {
                new Pineapple(),
                new Tomato()
        };
    }

    @Override
    public Pepperoni createPepperoni() {
        return new PepperoniClassic();
    }

    @Override
    public Clam createClams() {
        return new FrozenClam();
    }
}
