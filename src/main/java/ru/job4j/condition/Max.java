package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int first, int second, int third) {
        int result = max(first, second);
        return max(result, third);
    }

    public static int max(int first, int second, int third, int fourth) {
        int result = max(first, second, third);
        return max(result, fourth);
    }
}
