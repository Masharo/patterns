package com.masharo.others;

import com.masharo.Beverage;
import com.masharo.CondimentDecorator;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        super(beverage, .10, "Whip");
    }
}
