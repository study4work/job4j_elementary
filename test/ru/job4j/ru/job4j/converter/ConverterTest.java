package ru.job4j.ru.job4j.converter;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void rubleToEuro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void rubleToDollar() {
        double in = 140;
        double expected = 2.33;
        double out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out, 0.01);

    }
}