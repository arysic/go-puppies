package frogriverone;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {
    public int solution(int X, int[] A) {
        Set<Integer> setOfLeaves = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            setOfLeaves.add(A[i]);
            if (setOfLeaves.size() == X) return i;
        }
        return -1;
    }
}
