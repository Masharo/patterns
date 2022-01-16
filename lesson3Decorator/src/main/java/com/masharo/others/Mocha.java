package com.masharo.others;

import com.masharo.Beverage;
import com.masharo.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        super(beverage, .20, "Mocha");
    }
}
