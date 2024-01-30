package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (third >= second && third >= first) {
            result = third;
        }
        if (second >= first && second >= third) {
            result = second;
        }
        return result;
    }
}
