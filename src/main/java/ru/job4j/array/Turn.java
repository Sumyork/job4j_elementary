package ru.job4j.array;

public class Turn {

    public static int[] back(int[] array) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {

            if (count < array.length) {
                int temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = temp;
                count += 2;
            }
        }
        return array;
    }
}
