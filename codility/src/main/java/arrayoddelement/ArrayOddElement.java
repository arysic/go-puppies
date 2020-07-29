package arrayoddelement;

import java.util.HashSet;

//Do not use any lists if using contains a lot - kills the performance
public class ArrayOddElement {
    public int solution(int[] A) {
        return getOddElement(A);
    }

    private int getOddElement(int[] A) {
        HashSet<Integer> a = new HashSet<>();
        for (int i=0; i < A.length; i++) {
            if (a.contains(A[i])) {
                a.remove(A[i]);
            } else {
                a.add(A[i]);
            }
        }
        return a.stream().findFirst().get();
    }
}
