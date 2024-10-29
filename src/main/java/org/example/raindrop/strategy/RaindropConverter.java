package org.example.raindrop.strategy;

import org.example.raindrop.strategy.strategyInterface.RaindropNumberStrategy;

public class RaindropConverter {

    public static String raindropStrategy(int startRange, int endRange) {
        StringBuilder raindropResult = new StringBuilder();

        for (int i = startRange; i <= endRange; i++) {
            if (i > startRange) {
                raindropResult.append(",");
            }

            raindropResult.append(RaindropNumberStrategy.raindropFactory(i).getNumber());
        }

        System.out.println("RAINDROP RESULT: " + raindropResult);


        return raindropResult.toString();
    }
}
