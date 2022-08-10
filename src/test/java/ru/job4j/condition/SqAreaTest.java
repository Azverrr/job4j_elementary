package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP8K3Square2() {
        int expected = 3;
        double p = 8;
        double k = 3;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP16K7Square7() {
        int expected = 7;
        double p = 16;
        double k = 7;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }
}