package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MaxTest {

    @Test
    void whenMax1To2Then1() {
        int left = 1;
        int right = -2;
        int result = Max.max(left, right);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To1Then1() {
        int left = 3;
        int right = 10;
        int result = Max.max(left, right);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when1equals2Then1or2() {
        int left = 14;
        int right = 14;
        int result = Max.max(left, right);
        int expected = 14;
        assertThat(result).isEqualTo(expected);
    }
}