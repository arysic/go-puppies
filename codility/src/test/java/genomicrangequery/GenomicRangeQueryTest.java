package genomicrangequery;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;

public class GenomicRangeQueryTest {
    private GenomicRangeQuery genomicRangeQuery = new GenomicRangeQuery();

    @Test
    public void getSolutionExample1() {
        String S = "CAGCCTA";
        int[] P = {2, 5, 0};
        int[] Q = {4, 5, 6};
        int[] E = {2, 4, 1};
        Assertions.assertEquals(Arrays.toString(E), Arrays.toString(genomicRangeQuery.solution(S, P, Q)));
    }
}