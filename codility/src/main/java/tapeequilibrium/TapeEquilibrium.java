package tapeequilibrium;

import java.util.stream.IntStream;

public class TapeEquilibrium {
    public int solution(int[] A) {
        int checkSum = getSumOfElements(A);
        int sum = 0;
        int delta = Math.abs(checkSum);
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            delta = getMin(delta, Math.abs(checkSum - 2 * sum));
            if (delta == 0) {
                return delta;
            }
        }
        return delta;
    }

    private int getSumOfElements(int[] A) {
        return IntStream.of(A).sum();
    }

    private int getMin(int a, int b) {
        if (b < a) {
            return b;
        }
        return a;
    }
}
