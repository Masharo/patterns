package com.masharo.starbazz;

import java.util.Objects;

public abstract class CondimentDecorator extends Beverage {
    private Beverage beverage;
    private double cost;

    public CondimentDecorator(Beverage beverage, double cost, String description) {
        this.beverage = beverage;
        this.cost = cost;
        this.description = description;
    }

    @Override
    public String getDescription() {
        return (Objects.nonNull(beverage) ? beverage.getDescription()  + ", " : "") + description;
    }

    public double cost() {
        return cost + (Objects.nonNull(beverage) ? beverage.cost() : 0);
    }
}
