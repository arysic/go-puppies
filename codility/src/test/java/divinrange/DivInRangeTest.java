package divinrange;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class DivInRangeTest {
    private DivInRange divInRange = new DivInRange();

    @Test
    public void getSolutionExample1() {
        Assertions.assertEquals(3, divInRange.solution(6, 11, 2));
    }

    @Test
    public void getSolutionExample2() {
        Assertions.assertEquals(10, divInRange.solution(10, 100, 10));
    }

    @Test
    public void getSolutionExample3() {
        Assertions.assertEquals(1, divInRange.solution(0, 0, 11));
    }

    @Test
    public void getSolutionExample4() {
        Assertions.assertEquals(0, divInRange.solution(1, 1, 11));
    }
}