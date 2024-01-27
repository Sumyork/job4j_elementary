package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SwitchArrayTest {

    @Test
    void whenSwapBorderArrayLengthIs4() {
        int[] input = {1, 2, 3, 4};
        int[] result = SwitchArray.swapBorder(input);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwapBorderArrayLengthIs6() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] result = SwitchArray.swapBorder(input);
        int[] expected = {6, 2, 3, 4, 5, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwapBorderArrayLengthIs3() {
        int[] input = {1, 2, 3};
        int[] result = SwitchArray.swapBorder(input);
        int[] expected = {3, 2, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwapBorderArrayLengthIs1() {
        int[] input = {1};
        int[] result = SwitchArray.swapBorder(input);
        int[] expected = {1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int destination = input.length - 1;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap4to1() {
        int[] input = {5, -2, 0, 0, 1, 2, 10};
        int source = 0;
        int destination = 4;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {1, -2, 0, 0, 5, 2, 10};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap2to7() {
        int[] input = {0, 12, -1, 77, 14, -6, 0, 5, 15};
        int source = 2;
        int destination = 7;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {0, 12, 5, 77, 14, -6, 0, -1, 15};
        assertThat(result).containsExactly(expected);
    }
}