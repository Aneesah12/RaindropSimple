package org.example.raindrop.strategy;

import org.junit.jupiter.api.Test;

import static org.example.raindrop.strategy.RaindropConverter.raindropStrategy;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

//divisible by 3, 5 and 7
//3 = Pling
//5 = Plang
//7 = Plong
//3 and 5 = PlingPlang
//3 and 7 = PlingPlong
//5 and 7 = PlangPlong
//3, 5 and 7 = PlingPlangPlong

public class RaindropConverterTest {

    @Test
    public void oneNumber() {
        assertThat(raindropStrategy(1, 1), equalTo("1"));
    }

    @Test
    public void twoNumbers() {
        assertThat(raindropStrategy(1, 2), equalTo("1,2"));
    }

    @Test
    public void threeNumbers() {
        assertThat(raindropStrategy(1, 3), equalTo("1,2,Pling"));
    }

    @Test
    public void fiveNumbers() {
        assertThat(raindropStrategy(1, 5), equalTo("1,2,Pling,4,Plang"));
    }

    @Test
    public void sixNumbers() {
        assertThat(raindropStrategy(1, 6), equalTo("1,2,Pling,4,Plang,Pling"));
    }

    @Test
    public void tenNumbers() {
        assertThat(raindropStrategy(1, 10), equalTo("1,2,Pling,4,Plang,Pling,Plong,8,Pling,Plang"));
    }

    @Test
    public void ThirteenNumbers() {
        assertThat(raindropStrategy(1, 13), equalTo("1,2,Pling,4,Plang,Pling,Plong,8,Pling,Plang,11,Pling,Pling"));
    }

    @Test
    public void fifteenNumbers() {
        assertThat(raindropStrategy(1, 15), equalTo("1,2,Pling,4,Plang,Pling,Plong,8,Pling,Plang,11,Pling,Pling,Plong,PlingPlang"));
    }

    @Test
    public void TwentyThreeNumbers() {
        assertThat(raindropStrategy(1, 23), equalTo("1,2,Pling,4,Plang,Pling,Plong,8,Pling,Plang,11,Pling,Pling,Plong,PlingPlang,16,Plong,Pling,19,Plang,Pling,22,Pling"));
    }
}
