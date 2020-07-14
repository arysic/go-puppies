package arrayrotation;

public class ArrayRotation {
    public int[] solution(int[] A, int K) {
        return getNewA(A, K);
    }

    private int[] getNewA(int[] A, int K) {
        int lenA = A.length;
        int[] newA = new int[lenA];
        int i = calculateShift(lenA, K);
        for (int j = 0; j < lenA; j++) {
            if (j + i > lenA-1) {
                newA[j+i-lenA] = A[j];
            } else {
                newA[j+i] = A[j];
            }
        }
        return newA;
    }

    private int calculateShift(int lenA, int K) {
        return K > lenA ? lenA % K : K;
    }
}
