package com.masharo.lesson4Factory.abstractFactory;

import com.masharo.lesson4Factory.abstractFactory.factorys.ChicagoIngredientFactory;
import com.masharo.lesson4Factory.abstractFactory.factorys.NYIngredientFactory;

import java.util.Arrays;

public class TestDrive {

    public static void main(String[] args) {

        ChicagoIngredientFactory chicago = new ChicagoIngredientFactory();
        NYIngredientFactory ny = new NYIngredientFactory();

        System.out.println("=== Abstract Factory ===\n" +
                           "========================\n\n");

        soutInfo(chicago, "Chicago");
        soutInfo(ny, "NY");
    }

    public static void soutInfo(IngredientFactory iF, String name) {

        System.out.println("--- " + name + " ---");
        System.out.println("Cheese: " + iF.createCheese().getClass().getSimpleName());
        System.out.println("Clams: " + iF.createClams().getClass().getSimpleName());
        System.out.println("Dough: " + iF.createDough().getClass().getSimpleName());
        System.out.println("Pepperoni: " + iF.createPepperoni().getClass().getSimpleName());
        System.out.println("Sauce: " + iF.createSauce().getClass().getSimpleName());

        System.out.println("Veggies: ");
        Arrays.stream(iF.createVeggies())
                .forEach(
                        veggie -> System.out.println("  " + veggie.getClass().getSimpleName())
                );

        System.out.println();
    }
}
