package arrayelemmissing;

import java.util.Arrays;

public class ArrayElemMissing {
    public int solution(int[] A) {
        Arrays.sort(A);
        if (A.length > 0 && A[0] == 1) {
            if (A[A.length-1] == A.length) {
                return A.length+1;
            }
            int left = 0;
            int right = A.length - 1;
            int i;
            for (i = right/2; i > left;) {
                if (A[i] != i + 1) {
                    right = i;
                } else {
                    left = i;
                }
                i = left + (right-left)/2;
            }
            return A[i] + 1;
        } else {
            return 1;
        }
    }
}
