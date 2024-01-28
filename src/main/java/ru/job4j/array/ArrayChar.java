package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] prefix) {
        boolean result = true;
        for (int i = 0; i < word.length; i++) {
            for (int j = 0; j < prefix.length; j++) {
                if (i == j) {
                    if (word[i] != prefix[j]) {
                        result = false;
                        break;
                    }
                }
            }
        }
        return result;
    }
}
