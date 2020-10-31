package ru.job4j.ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
            public void whenMax1To2Then2() {
                int result = Max.max(1, 2);
                assertThat(result, is(2));
            }

            @Test
    public void  whenMax5To3To2Then5() {
        int result = Max.max(2, 3, 5);
        assertThat(result, is(5));
            }

            @Test
    public void  whenMax10To5To2Then10() {
        int result = Max.max(2, 10, 5);
        assertThat(result, is(10));
    }
}

