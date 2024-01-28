package ru.job4j.array;

public class EndsWith {

    public static boolean endsWith(char[] word, char[] postfix) {
        boolean result = true;
        for (int i = 0; i < word.length; i++) {
            for (int j = 0; j < postfix.length; j++) {
                if (i == j) {
                    if (word[word.length - i - 1] != postfix[postfix.length - j - 1]) {
                        result = false;
                        break;
                    }
                }
            }
        }
        return result;
    }
}
