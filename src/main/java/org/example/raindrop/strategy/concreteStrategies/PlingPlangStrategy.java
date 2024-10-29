package org.example.raindrop.strategy.concreteStrategies;

import org.example.raindrop.strategy.Number;
import org.example.raindrop.strategy.strategyInterface.RaindropNumberStrategy;

public class PlingPlangStrategy implements RaindropNumberStrategy {

    @Override
    public String getNumber() {
        return "PlingPlang";
    }

    @Override
    public boolean accepts(int number) {
        return (number % 3 == 0) && (number % 5 == 0) ||
                (Number.contains(number, "5") && Number.contains(number, "3"));
    }

}
