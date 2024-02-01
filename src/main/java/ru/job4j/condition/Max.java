package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        int result = first >= second ? first : second;
        return result;
    }

    public static int max(int first, int second, int third) {
        if (first >= max(second, third)) {
            return first;
        } else if (second > max(first, third)) {
            return second;
        }
        return third;
    }

    public static int max(int first, int second, int third, int fourth) {
        if (first >= max(second, third, fourth)) {
            return first;
        } else if (second > max(first, third, fourth)) {
            return second;
        } else if (third > max(first, second, fourth)) {
            return third;
        }
        return fourth;
    }
}
