package com.masharo.pizza.ingredientFactory;

import com.masharo.pizza.ingredient.Pepperoni;
import com.masharo.pizza.ingredient.*;
import com.masharo.pizza.ingredient.cheese.MozzarellaCheese;
import com.masharo.pizza.ingredient.clams.FrozenClams;
import com.masharo.pizza.ingredient.dough.ThickCrustDough;
import com.masharo.pizza.ingredient.pepperoni.SlicedPepperoni;
import com.masharo.pizza.ingredient.sauce.PlumTomatoSauce;
import com.masharo.pizza.ingredient.veggies.BlackOlives;
import com.masharo.pizza.ingredient.veggies.EggPlant;
import com.masharo.pizza.ingredient.veggies.Spinach;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[] { new BlackOlives(), new EggPlant(), new Spinach()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }
}
