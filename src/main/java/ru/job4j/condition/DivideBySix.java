package ru.job4j.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        String rsl;
        if (isEven(number) && isDivThree(number)) {
            rsl = "Исходное число делится на 6.";
        } else if (isDivThree(number)) {
            rsl = "Исходное число делится на 3, но не является четным.";
        } else if (isEven(number)) {
            rsl = "Исходное число не делится на 3, но является четным.";
        } else {
            rsl = "Исходное число не делится на 3 и не является четным.";
        }
        return rsl;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isDivThree(int num) {
        return num % 3 == 0;
    }
}
