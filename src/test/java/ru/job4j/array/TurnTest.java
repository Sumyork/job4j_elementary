package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class TurnTest {

    @Test
    void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = new int[] {2, 6, 1, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {1, 6, 11, 3, 5, 0, 2};
        int[] result = Turn.back(input);
        int[] expected = new int[] {2, 0, 5, 3, 11, 6, 1};
        assertThat(result).containsExactly(expected);
    }
}