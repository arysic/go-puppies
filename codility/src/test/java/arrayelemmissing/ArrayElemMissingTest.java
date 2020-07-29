package arrayelemmissing;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ArrayElemMissingTest {
    private ArrayElemMissing arrayElemMissing = new ArrayElemMissing();

    @Test
    public void getSolutionExample1() {
        int[] A = {1,2,3,4,5,6,7,9};
        Assertions.assertEquals(8, arrayElemMissing.solution(A));
    }

    @Test
    public void getSolutionExample2() {
        int[] A = {1,3,4,5,6,7};
        Assertions.assertEquals(2, arrayElemMissing.solution(A));
    }

    @Test
    public void getSolutionExample3() {
        int[] A = {1,3};
        Assertions.assertEquals(2, arrayElemMissing.solution(A));
    }

    @Test
    public void getSolutionEmpty() {
        int[] A = {};
        Assertions.assertEquals(1, arrayElemMissing.solution(A));
    }

    @Test
    public void getSolutionSingle() {
        int[] A = {2};
        Assertions.assertEquals(1, arrayElemMissing.solution(A));
    }

    @Test
    public void getSolutionSingle2() {
        int[] A = {1};
        Assertions.assertEquals(2, arrayElemMissing.solution(A));
    }

    @Test
    public void getSolutionFirstMissing() {
        int[] A = {2,3,4,5,6};
        Assertions.assertEquals(1, arrayElemMissing.solution(A));
    }

    @Test
    public void getSolutionLastMissing() {
        int[] A = {1,2,3,4,5,6,7,8,9};
        Assertions.assertEquals(10, arrayElemMissing.solution(A));
    }
}
