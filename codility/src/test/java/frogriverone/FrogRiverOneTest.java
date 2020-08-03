package frogriverone;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class FrogRiverOneTest {
    private FrogRiverOne frogRiverOne = new FrogRiverOne();

    @Test
    public void getSolutionExample1() {
        int X = 5;
        int[] A = {1, 3, 1, 4, 2, 3, 5, 4};
        Assertions.assertEquals(6, frogRiverOne.solution(X, A));
    }

    @Test
    public void getSolutionExample2() {
        int X = 1;
        int[] A = {1};
        Assertions.assertEquals(0, frogRiverOne.solution(X, A));
    }

    @Test
    public void getSolutionExample3() {
        int X = 6;
        int[] A = {1, 3, 1, 4, 2, 3, 5, 4};
        Assertions.assertEquals(-1, frogRiverOne.solution(X, A));
    }
}
