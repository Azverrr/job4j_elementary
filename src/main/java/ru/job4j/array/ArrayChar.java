package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        String stringWord = "";
        String stringPref = "";
        for (char charWord : word) {
            stringWord += charWord;
        }
        for (char charPref : pref) {
            stringPref += charPref;
            if (!stringWord.startsWith(stringPref)) {
                result = false;
                break;
            }
        }
        return result;
    }
}
