package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int count = 0;
        money -= price;
        for (int index = 0; index < coins.length;) {
            while (money >= coins[index] && money >= 0) {
                money -= coins[index];
                rsl[count] = coins[index];
                count++;
            }
            index++;
        }
        int size = count;
        return Arrays.copyOf(rsl, size);
    }
}