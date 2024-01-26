package ru.job4j.condition;

public class ChessBoard {

    public static int way(int x1, int y1, int x2, int y2) {
        int result = 0;

        if (isValid(x1) && isValid(x2)
                && isValid(y1) && isValid(y2)) {
            if (Math.abs(x1 - y1) == Math.abs(x2 - y2)) {
                result = Math.abs(x2 - x1);
                return result;
            }
        }
        return result;
    }

    private static boolean isValid(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }

    public static void main(String[] args) {
        int way = way(6, 7, 1, 2);
        System.out.println(way);
    }
}
