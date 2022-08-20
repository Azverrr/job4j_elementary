package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int count = 0;
        money -= price;
        while (money > 0) {
            for (int index = 0; index < coins.length;) {
                if (money >= coins[index]) {
                    money -= coins[index];
                    rsl[count] = coins[index];
                    count++;
                } else {
                    index++;
                }
            }
        }
        int size = count;
        return Arrays.copyOf(rsl, size);
    }
}