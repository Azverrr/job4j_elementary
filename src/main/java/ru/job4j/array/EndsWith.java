package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int index = 0; index < post.length; index++) {
            int lastIndexWord = word.length - index - 1;
            int lastIndexPost = post.length - index - 1;
            if (word[lastIndexWord] != post[lastIndexPost]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
