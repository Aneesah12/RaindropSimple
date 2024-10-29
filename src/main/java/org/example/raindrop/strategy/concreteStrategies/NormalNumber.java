package org.example.raindrop.strategy.concreteStrategies;

import org.example.raindrop.strategy.strategyInterface.RaindropNumberStrategy;

public class NormalNumber implements RaindropNumberStrategy {

    private int i;
    public NormalNumber(int i) {
        this.i = i;
    }
    @Override
    public String getNumber() {
        return Integer.toString(i);
    }

    @Override
    public boolean accepts(int number) {
        return true;
    }
}
