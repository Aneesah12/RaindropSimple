package org.example.raindrop.strategy.strategyInterface;

import org.example.raindrop.strategy.concreteStrategies.*;

import java.util.Arrays;
import java.util.List;

public interface RaindropNumberStrategy {

    List<RaindropNumberStrategy> RAINDROP_NUMBER_STRATEGY_LIST = Arrays.asList(
            new PlingPlangPlongStrategy(),
            new PlingPlangStrategy(),
            new PlingPlongStrategy(),
            new PlangPlongStrategy(),
            new PlingOrPlangOrPlongStrategy(3, "Pling"),
            new PlingOrPlangOrPlongStrategy(5, "Plang"),
            new PlingOrPlangOrPlongStrategy(7, "Plong")
    );

    String getNumber();
    boolean accepts(int number);

    static RaindropNumberStrategy raindropFactory(int i) {

        for (RaindropNumberStrategy strategy : RAINDROP_NUMBER_STRATEGY_LIST) {
            if (strategy.accepts(i)) {
                return strategy;
            }
        }
        return new NormalNumber(i);
    }
}
