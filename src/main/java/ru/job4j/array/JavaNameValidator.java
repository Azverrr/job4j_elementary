package ru.job4j.array;

import static java.lang.Character.isDigit;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean result = true;
        if (name.isEmpty() || !isLowerLatinLetter(name.codePointAt(0))) {
            return false;
        }
        char[] array = name.toCharArray();
        for (int charIndex = 1; charIndex < array.length; charIndex++) {
            if (!isUpperLatinLetter(name.codePointAt(charIndex)) && !isLowerLatinLetter(name.codePointAt(charIndex)) && !isSpecialSymbol(name.codePointAt(charIndex)) && !isDigit(name.codePointAt(charIndex))) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }
}
