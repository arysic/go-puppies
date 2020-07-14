package binarygap;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import utils.TestDataRepository;
import utils.integer.IntegerResultTestEntity;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BinaryGapTest {
    private BinaryGap                       binaryGap = new BinaryGap();
    private static final String             fileName = "resources/BinaryGapTestData.json";
    private static final ClassLoader        classLoader = TestDataRepository.class.getClassLoader();
    private File                            file = new File(Objects.requireNonNull(classLoader.getResource(fileName)).getFile());
    private List<IntegerResultTestEntity>   binaryGapTestData = new ArrayList<>();

    @BeforeAll
    public void getBinaryGapTestData() {

    }

    @Test
    public void getBinaryGapTested() {

        Assertions.assertEquals(binaryGap.solution(1041), 5);
    }

    void getSolutionExample2() {
        Assertions.assertEquals(binaryGap.solution(15), 0);
    }
    void getSolutionExample3() {
        Assertions.assertEquals(binaryGap.solution(32), 0);
    }
    void getSolutionExtreme1() {
        Assertions.assertEquals(binaryGap.solution(1), 0);
    }
    void getSolutionExtreme2() {
        Assertions.assertEquals(binaryGap.solution(5), 1);
    }
    void getSolutionExtreme3() {
        Assertions.assertEquals(binaryGap.solution(2147483647), 5);
    }
    void getSolutionTrailingZeros1() {
        Assertions.assertEquals(binaryGap.solution(6), 0);
    }
    void getSolutionTrailingZeros2() {
        Assertions.assertEquals(binaryGap.solution(328), 2);
    }
    void getSolutionPowerOfTwo1() {
        Assertions.assertEquals(binaryGap.solution(16), 1);
    }
    void getSolutionPowerOfTwo2() {
        Assertions.assertEquals(binaryGap.solution(1024), 6);
    }
    void getSolutionSimple1() {
        Assertions.assertEquals(binaryGap.solution(9), 2);
    }
    void getSolutionSimple2() {
        Assertions.assertEquals(binaryGap.solution(11), 1);
    }
    void getSolutionSimple3() {
        Assertions.assertEquals(binaryGap.solution(1162), 3);
    }
    void getSolutionMedium1() {
        Assertions.assertEquals(binaryGap.solution(51712), 2);
    }
    void getSolutionMedium2() {
        Assertions.assertEquals(binaryGap.solution(561892), 3);
    }
    void getSolutionMedium3() {
        Assertions.assertEquals(binaryGap.solution(66561), 9);
    }
    void getSolutionLarge1() {
        Assertions.assertEquals(binaryGap.solution(6291457), 20);
    }
    void getSolutionLarge2() {
        Assertions.assertEquals(binaryGap.solution(74901729), 4);
    }
    void getSolutionLarge3() {
        Assertions.assertEquals(binaryGap.solution(805306373), 25);
    }
    void getSolutionLarge4() {
        Assertions.assertEquals(binaryGap.solution(1073741825), 29);
    }
    void getSolutionLarge5() {
        Assertions.assertEquals(binaryGap.solution(1610612737), 28);
    }
}
