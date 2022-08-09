package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumMetods(double first, double second) {
        return minus(first, second) + dev(first, second);
    }

    public static double sumAllMetods(double first, double second) {
        return sumMetods(first, second) + multiply(first, second) + sum(first, second);
    }
}
