package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00To02Then2() {
        double expected = 2;
        int x1 = 0;
        int x2 = 0;
        int y1 = 0;
        int y2 = 2;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    public void when10To20Then2() {
        double expected = 2;
        int x1 = 1;
        int x2 = 3;
        int y1 = 0;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    public void when02To04Then2() {
        double expected = 2;
        int x1 = 0;
        int x2 = 0;
        int y1 = 2;
        int y2 = 4;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

}