package counters;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;

public class CountersTest {
    private Counters counters = new Counters();

    @Test
    public void getSolutionExample1() {
        int X = 5;
        int[] A = {3, 4, 4, 6, 1, 4, 4};
        int[] E = {3, 2, 2, 4, 2};
        Assertions.assertEquals(Arrays.toString(E), Arrays.toString(counters.solution(X, A)));
    }

    @Test
    public void getSolutionExample2() {
        int X = 5;
        int[] A = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 6, 6, 6, 6, 6, 6};
        int[] E = {10, 10, 10, 10, 10};
        Assertions.assertEquals(Arrays.toString(E), Arrays.toString(counters.solution(X, A)));
    }

    @Test
    public void getSolutionExample3() {
        int X = 5;
        int[] A = {6, 6, 6, 6, 6, 6};
        int[] E = {0, 0, 0, 0, 0};
        Assertions.assertEquals(Arrays.toString(E), Arrays.toString(counters.solution(X, A)));
    }
}
