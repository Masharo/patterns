package com.masharo.lesson4Factory.abstractFactory.factorys;

import com.masharo.lesson4Factory.abstractFactory.IngredientFactory;
import com.masharo.lesson4Factory.abstractFactory.ingredients.*;
import com.masharo.lesson4Factory.abstractFactory.ingredients.Cheese;
import com.masharo.lesson4Factory.abstractFactory.ingredients.cheese.Mozzarella;
import com.masharo.lesson4Factory.abstractFactory.ingredients.clam.FreshClam;
import com.masharo.lesson4Factory.abstractFactory.ingredients.dough.ThinDough;
import com.masharo.lesson4Factory.abstractFactory.ingredients.pepperoni.PepperoniSpicy;
import com.masharo.lesson4Factory.abstractFactory.ingredients.sauce.CheeseSauce;
import com.masharo.lesson4Factory.abstractFactory.ingredients.veggie.Pineapple;
import com.masharo.lesson4Factory.abstractFactory.ingredients.veggie.Tomato;
import com.masharo.lesson4Factory.abstractFactory.ingredients.veggie.Сhampignon;

public class NYIngredientFactory implements IngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinDough();
    }

    @Override
    public Sauce createSauce() {
        return new CheeseSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Mozzarella();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[] {
                new Tomato(),
                new Pineapple(),
                new Сhampignon()
        };
    }

    @Override
    public Pepperoni createPepperoni() {
        return new PepperoniSpicy();
    }

    @Override
    public Clam createClams() {
        return new FreshClam();
    }
}
