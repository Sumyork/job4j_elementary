package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {

        int result = left >= right ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int result = max(11, 11);
        System.out.println(result);
    }
}
