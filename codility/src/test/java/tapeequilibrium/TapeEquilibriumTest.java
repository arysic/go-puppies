package tapeequilibrium;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TapeEquilibriumTest {
    private TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();

    @Test
    public void getSolutionExample1() {
        int[] A = {1,2,3,4,5,6,7,8};
        Assertions.assertEquals(6, tapeEquilibrium.solution(A));
    }

    @Test
    public void getSolutionDouble() {
        int[] A = {1,2};
        Assertions.assertEquals(1, tapeEquilibrium.solution(A));
    }
}
