package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when20to41then2dot23() {
        double expected = 2.23;
        Point a = new Point(2, 0);
        Point b = new Point(4, 1);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when0Minus4toMinus2Minus3then2dot23() {
        double expected = 2.23;
        Point a = new Point(0, -4);
        Point b = new Point(-2, -3);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when11to2Minus2then3dot16() {
        double expected = 3.16;
        Point a = new Point(1, 1);
        Point b = new Point(2, -2);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when0Minus8to02then10() {
        double expected = 10;
        Point a = new Point(0, -8);
        Point b = new Point(0, 2);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}