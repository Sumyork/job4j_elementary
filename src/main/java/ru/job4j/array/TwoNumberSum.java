package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = 1;
        int[] newArray = new int[2];
        while (j < array.length) {
            if (array[i] + array[j] == target) {
                newArray[0] = i;
                newArray[1] = j;
                break;
            } else {
                j++;
            }
            if (j == array.length) {
               i++;
               j = i + 1;
            }
            if (i == array.length || j == array.length) {
                newArray = new int[0];
            }
        }
        return newArray;
    }
}
