package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SortSelectedTest {

    @Test
    public void whenSort5Elements() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3Elements() {
        int[] data = new int[] {-1, -4, 0};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-4, -1, 0};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort9Elements() {
        int[] data = new int[] {3, 15, -80, -14, 0, 1, -3, 9, 2};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-80, -14, -3, 0, 1, 2, 3, 9, 15};
        assertThat(result).containsExactly(expected);
    }
}