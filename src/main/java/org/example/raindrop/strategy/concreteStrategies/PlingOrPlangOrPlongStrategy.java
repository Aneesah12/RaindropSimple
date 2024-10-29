package org.example.raindrop.strategy.concreteStrategies;

import org.example.raindrop.strategy.Number;
import org.example.raindrop.strategy.strategyInterface.RaindropNumberStrategy;

public class PlingOrPlangOrPlongStrategy implements RaindropNumberStrategy {

    private int divisor;
    private String numberInTheStringRepresentative;

    public PlingOrPlangOrPlongStrategy(int divisor, String numberInTheStringRepresentative) {
        this.divisor = divisor;
        this.numberInTheStringRepresentative = numberInTheStringRepresentative;
    }

    @Override
    public String getNumber() {
        return numberInTheStringRepresentative;
    }

    @Override
    public boolean accepts(int number) {
        return number % divisor == 0 ||  Number.contains(number, Integer.toString(divisor));
    }
}
