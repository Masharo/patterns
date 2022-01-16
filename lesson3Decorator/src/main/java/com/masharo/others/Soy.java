package com.masharo.others;

import com.masharo.Beverage;
import com.masharo.CondimentDecorator;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        super(beverage, .15, "Soy");
    }
}
