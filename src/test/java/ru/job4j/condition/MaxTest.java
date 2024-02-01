package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MaxTest {

    @Test
    void whenMax1To2Then1() {
        int first = 1;
        int second = -2;
        int result = Max.max(first, second);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To1Then1() {
        int first = 3;
        int second = 10;
        int result = Max.max(first, second);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when1equals2Then1or2() {
        int first = 14;
        int second = 14;
        int result = Max.max(first, second);
        int expected = 14;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenFirst4SecondMinus5Third14() {
        int first = 4;
        int second = -5;
        int third = 14;
        int result = Max.max(first, second, third);
        int expected = 14;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenFirst1Second0Third11FourthMinus3() {
        int first = 1;
        int second = 0;
        int third = 11;
        int fourth = -3;
        int result = Max.max(first, second, third, fourth);
        int expected = 11;
        assertThat(result).isEqualTo(expected);
    }
}