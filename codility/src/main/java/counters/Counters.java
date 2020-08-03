package counters;

import java.util.Arrays;

public class Counters {
    public int[] solution(int N, int[] A) {
        int[] result = new int[N];
        int max = 0;
        for (int i = 0; i < A.length; i++) {
            if(A[i] > N) {
                Arrays.fill(result, max);
            } else {
                result[A[i]-1] += 1;
                if (result[A[i]-1] > max) {
                    max = result[A[i]-1];
                }
            }
        }
        return result;
    }
}
