package com.masharo.starbazz.others;

import com.masharo.starbazz.Beverage;
import com.masharo.starbazz.CondimentDecorator;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        super(beverage, .10, "Whip");
    }
}
