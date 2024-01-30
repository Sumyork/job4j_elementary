package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = array.length - 1;
        int[] newArray = new int[0];
        while (j > i) {
            if (array[i] + array[j] == target) {
                newArray = new  int[2];
                newArray[0] = i;
                newArray[1] = j;
                break;
            } else if (i == j - 1) {
                j = array.length - 1;
                i++;
            } else {
                j--;
            }
        }
        return newArray;
    }
}
