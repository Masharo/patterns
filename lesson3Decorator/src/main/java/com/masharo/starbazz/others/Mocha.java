package com.masharo.starbazz.others;

import com.masharo.starbazz.Beverage;
import com.masharo.starbazz.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        super(beverage, .20, "Mocha");
    }
}
