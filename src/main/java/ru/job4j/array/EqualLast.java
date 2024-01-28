package ru.job4j.array;

public class EqualLast {

    public static boolean check(int[] left, int[] right) {
        boolean result = true;
        for (int i = 0; i < left.length - 1; i++) {
            for (int j = 0; j < right.length - 1; j++) {
                if (left[left.length - 1] != right[right.length - 1]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
