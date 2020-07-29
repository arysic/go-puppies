package binarygap;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class BinaryGapTest {
    private BinaryGap binaryGap = new BinaryGap();

    @Test
    public void getSolutionExample1() {
        Assertions.assertEquals(5, binaryGap.solution(1041));
    }

    @Test
    public void getSolutionExample2() {
        Assertions.assertEquals(0, binaryGap.solution(15));
    }

    @Test
    public void getSolutionExample3() {
        Assertions.assertEquals(0, binaryGap.solution(32));
    }

    @Test
    public void getSolutionExtreme1() {
        Assertions.assertEquals(0, binaryGap.solution(1));
    }

    @Test
    public void getSolutionExtreme2() {
        Assertions.assertEquals(1, binaryGap.solution(5));
    }

    @Test
    public void getSolutionExtreme3() {
        Assertions.assertEquals(0, binaryGap.solution(2147483647));
    }

    @Test
    public void getSolutionTrailingZeros1() {
        Assertions.assertEquals(0, binaryGap.solution(6));
    }

    @Test
    public void getSolutionTrailingZeros2() {
        Assertions.assertEquals(2, binaryGap.solution(328));
    }

    @Test
    public void getSolutionPowerOfTwo1() {
        Assertions.assertEquals(0, binaryGap.solution(16));
    }

    @Test
    public void getSolutionPowerOfTwo2() {
        Assertions.assertEquals(0, binaryGap.solution(1024));
    }

    @Test
    public void getSolutionSimple1() {
        Assertions.assertEquals(2, binaryGap.solution(9));
    }

    @Test
    public void getSolutionSimple2() {
        Assertions.assertEquals(1, binaryGap.solution(11));
    }

    @Test
    public void getSolutionSimple3() {
        Assertions.assertEquals(3, binaryGap.solution(1162));
    }

    @Test
    public void getSolutionMedium1() {
        Assertions.assertEquals(2, binaryGap.solution(51712));
    }

    @Test
    public void getSolutionMedium2() {
        Assertions.assertEquals(3, binaryGap.solution(561892));
    }

    @Test
    public void getSolutionMedium3() {
        Assertions.assertEquals(9, binaryGap.solution(66561));
    }

    @Test
    public void getSolutionLarge1() {
        Assertions.assertEquals(20, binaryGap.solution(6291457));
    }

    @Test
    public void getSolutionLarge2() {
        Assertions.assertEquals(4, binaryGap.solution(74901729));
    }

    @Test
    public void getSolutionLarge3() {
        Assertions.assertEquals(25, binaryGap.solution(805306373));
    }

    @Test
    public void getSolutionLarge4() {
        Assertions.assertEquals(29, binaryGap.solution(1073741825));
    }

    @Test
    public void getSolutionLarge5() {
        Assertions.assertEquals(28, binaryGap.solution(1610612737));
    }
}
