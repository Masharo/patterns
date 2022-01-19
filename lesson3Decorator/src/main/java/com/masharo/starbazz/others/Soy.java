package com.masharo.starbazz.others;

import com.masharo.starbazz.Beverage;
import com.masharo.starbazz.CondimentDecorator;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        super(beverage, .15, "Soy");
    }
}
