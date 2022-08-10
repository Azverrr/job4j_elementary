package ru.job4j.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenMan180Then92() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void womanWeight() {
        short in = 150;
        double expected = 46;
        double out = Fit.womanWeight(in);
        assertEquals(expected, out, 0.01);
    }
}