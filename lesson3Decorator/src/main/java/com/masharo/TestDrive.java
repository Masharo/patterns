package com.masharo;

import com.masharo.coffee.DarkRoast;
import com.masharo.coffee.Espresso;
import com.masharo.coffee.HouseBlend;
import com.masharo.others.Mocha;
import com.masharo.others.Soy;
import com.masharo.others.Whip;

public class TestDrive {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverageInfo(beverage));

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverageInfo(beverage1));

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverageInfo(beverage2));
    }

    public static String beverageInfo(Beverage beverage) {
        return beverage.getDescription() + " $" + beverage.cost();
    }
}
