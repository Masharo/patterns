package com.masharo.pizza.ingredientFactory;

import com.masharo.pizza.PizzaIngredientFactory;
import com.masharo.pizza.ingredient.Pepperoni;
import com.masharo.pizza.ingredient.*;
import com.masharo.pizza.ingredient.cheese.ReggianoCheese;
import com.masharo.pizza.ingredient.clams.FreshClams;
import com.masharo.pizza.ingredient.dough.ThinCrustDough;
import com.masharo.pizza.ingredient.pepperoni.SlicedPepperoni;
import com.masharo.pizza.ingredient.sauce.MarinaraSauce;
import com.masharo.pizza.ingredient.veggies.Garlic;
import com.masharo.pizza.ingredient.veggies.Mushroom;
import com.masharo.pizza.ingredient.veggies.Onion;
import com.masharo.pizza.ingredient.veggies.RedPepper;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[] { new Garlic(), new Mushroom(), new Onion(), new RedPepper() };
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
