package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when20to41then2dot23() {
        double expected = 2.23;
        int x1 = 2;
        int y1 = 0;
        int x2 = 4;
        int y2 = 1;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when0Minus4toMinus2Minus3then2dot23() {
        double expected = 2.23;
        int x1 = 0;
        int y1 = -4;
        int x2 = -2;
        int y2 = -3;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when11to2Minus2then3dot16() {
        double expected = 3.16;
        int x1 = 1;
        int y1 = 1;
        int x2 = 2;
        int y2 = -2;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when0Minus8to02then10() {
        double expected = 10;
        int x1 = 0;
        int y1 = -8;
        int x2 = 0;
        int y2 = 2;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}