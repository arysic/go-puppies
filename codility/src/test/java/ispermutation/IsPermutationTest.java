package ispermutation;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class IsPermutationTest {
    private IsPermutation isPermutation = new IsPermutation();

    @Test
    public void getSolutionExample1() {
        int[] A = {1, 3, 6, 4, 1, 2};
        Assertions.assertEquals(0, isPermutation.solution(A));
    }

    @Test
    public void getSolutionExample2() {
        int[] A = {4, 1, 3, 2};
        Assertions.assertEquals(1, isPermutation.solution(A));
    }

    @Test
    public void getSolutionExample3() {
        int[] A = {4, 1, 3};
        Assertions.assertEquals(0, isPermutation.solution(A));
    }

    @Test
    public void getSolutionExample4() {
        int[] A = {4, 1};
        Assertions.assertEquals(0, isPermutation.solution(A));
    }

    @Test
    public void getSolutionExample5() {
        int[] A = {2, 2};
        Assertions.assertEquals(0, isPermutation.solution(A));
    }
}