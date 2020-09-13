package ru.job4j.ru.job4j.condition;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int result = Factorial.calc(5);
        assertThat(result, Matchers.is(120));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int result = Factorial.calc(0);
        assertThat(result, Matchers.is(1));
    }

    @Test
    public void whenCalculateFactorialForOneThenOne() {
        int result = Factorial.calc(1);
        assertThat(result, Matchers.is(1));
    }
}