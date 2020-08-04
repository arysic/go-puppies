package missinginteger;

import java.util.Arrays;

public class MissingInteger {
    public int solution(int[] A) {
        boolean hasOne = false;
        Arrays.sort(A);
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] > 0) {
                if (A[i] == 1) hasOne = true;
                if (!hasOne) return 1;
                if (A[i + 1] - A[i] > 1) return A[i] + 1;
            }
        }
        if (A.length == 1) return A[0] == 1 ? 2 : 1;
        if (A[A.length - 1] > 0 && hasOne) {
            return A[A.length - 1] + 1;
        } else {
            return 1;
        }
    }
}
