package org.example.raindrop.strategy.concreteStrategies;

import org.example.raindrop.strategy.Number;
import org.example.raindrop.strategy.strategyInterface.RaindropNumberStrategy;

public class PlangPlongStrategy implements RaindropNumberStrategy {

    @Override
    public String getNumber() {
        return "PlangPlong";
    }

    @Override
    public boolean accepts(int number) {
        return (number % 5 == 0) && (number % 7 == 0) ||
                (Number.contains(number, "7") && Number.contains(number, "5"));
    }

}
