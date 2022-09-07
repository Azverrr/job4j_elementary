package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00To02Then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10To20Then2() {
        double expected = 2;
        Point a = new Point(1, 0);
        Point b = new Point(3, 0);
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when02To04Then2() {
        double expected = 2;
        Point a = new Point(0, 2);
        Point b = new Point(0, 4);
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }
}