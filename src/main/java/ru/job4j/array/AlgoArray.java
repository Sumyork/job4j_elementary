package ru.job4j.array;

public class AlgoArray {

    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int temp = array[0];
        array[0] = array[3];
        array[3] = temp;
        temp = array[1];
        array[1] = array[2];
        array[2] = temp;
        temp = array[3];
        array[3] = array[4];
        array[4] = temp;

        StringBuilder stringBuilder = new StringBuilder();
        for (int number : array) {
            stringBuilder.append(number);
            stringBuilder.append(", ");
        }
        System.out.println(stringBuilder
                .deleteCharAt(stringBuilder.length() - 2));
    }
}
