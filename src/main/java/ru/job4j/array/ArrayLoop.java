package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] ints = new int[5];
        for (int index = 0; index < ints.length; index++) {
            ints[index] = index * 2 + 3;
        }
        for (int index = 0; index < ints.length; index++) {
            System.out.println(ints[index]);
        }
    }
}
