package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MatrixCheckTest {

    @Test
    public void whenHasMono1Horizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        int row = 1;
        boolean result = MatrixCheck.monoHorizontal(input, row);
        assertThat(result).isTrue();
    }

    @Test
    public void whenHasNotMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '},
        };
        int row = 1;
        boolean result = MatrixCheck.monoHorizontal(input, row);
        assertThat(result).isFalse();
    }

    @Test
    public void whenHasMono2Horizontal() {
        char[][] input = {
                {' ', ' ', ' ', 'X'},
                {'X', 'X', ' ', 'X'},
                {'X', 'X', 'X', 'X'},
                {' ', ' ', ' ', ' '},
        };
        int row = 2;
        boolean result = MatrixCheck.monoHorizontal(input, row);
        assertThat(result).isTrue();
    }
}