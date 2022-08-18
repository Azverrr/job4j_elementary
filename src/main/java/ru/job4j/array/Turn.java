package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int center = (Integer) array.length / 2;
        int temp = 0;
        for (int index = 0; index < center; index++) {
            temp = array[(array.length - 1) - index];
            array[(array.length - 1) - index] = array[index];
            array[index] = temp;
        }
        return array;
    }
}