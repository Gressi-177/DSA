package Array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MoveZeroesEndTest{
    private static Stream<int[][]> moveZeroesEnd_DataProvider() {
        return Stream.of(
                new int[][]{{0, 1, 0, 3, 12}, {1, 3, 12, 0, 0}},
                new int[][]{{1, 3, 12, 0, 0}, {1, 3, 12, 0, 0}},
                new int[][]{{1, 3, 12}, {1, 3, 12}},
                new int[][]{{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}},
                new int[][]{{1}, {1}},
                new int[][]{{}, {}}
        );
    }

    @ParameterizedTest
    @MethodSource("moveZeroesEnd_DataProvider")
    public void testMoveZeroesEnd_01(int[][] data) {
        int[] input = data[0];
        int[] expected = data[1];
        assertArrayEquals(expected, MoveZeroesEnd.moveZeroesEnd_01(input, input.length));
    }

    @ParameterizedTest
    @MethodSource("moveZeroesEnd_DataProvider")
    public void testMoveZeroesEnd_02(int[][] data) {
        int[] input = data[0];
        int[] expected = data[1];
        assertArrayEquals(expected, MoveZeroesEnd.moveZeroesEnd_02(input, input.length));
    }

    @ParameterizedTest
    @MethodSource("moveZeroesEnd_DataProvider")
    public void testMoveZeroesEnd_03(int[][] data) {
        int[] input = data[0];
        int[] expected = data[1];
        assertArrayEquals(expected, MoveZeroesEnd.moveZeroesEnd_03(input, input.length));
    }
}
