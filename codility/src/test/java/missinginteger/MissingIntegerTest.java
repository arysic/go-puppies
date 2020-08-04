package missinginteger;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MissingIntegerTest {
    private MissingInteger missingInteger = new MissingInteger();

    @Test
    public void getSolutionExample1() {
        int[] A = {1, 3, 6, 4, 1, 2};
        Assertions.assertEquals(5, missingInteger.solution(A));
    }

    @Test
    public void getSolutionExample2() {
        int[] A = {1, 2, 3};
        Assertions.assertEquals(4, missingInteger.solution(A));
    }

    @Test
    public void getSolutionExample3() {
        int[] A = {-1, -3};
        Assertions.assertEquals(1, missingInteger.solution(A));
    }

    @Test
    public void getSolutionExample4() {
        int[] A = {-1};
        Assertions.assertEquals(1, missingInteger.solution(A));
    }

    @Test
    public void getSolutionExample5() {
        int[] A = {2};
        Assertions.assertEquals(1, missingInteger.solution(A));
    }

    @Test
    public void getSolutionExample6() {
        int[] A = {1};
        Assertions.assertEquals(2, missingInteger.solution(A));
    }
}
