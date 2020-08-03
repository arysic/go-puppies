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
}
