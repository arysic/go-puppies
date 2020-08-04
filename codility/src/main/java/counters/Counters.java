package counters;

import java.util.*;

public class Counters {
    public int[] solution(int N, int[] A) {
        int max = 0;
        int maxChange = 0;
        int tmp;
        Map<Integer, Integer> changeMap = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if(A[i] > N) {
                max += maxChange;
                changeMap.clear();
                maxChange = 0;
            } else {
                tmp = (changeMap.get(A[i]) == null ? 0 : changeMap.get(A[i])) + 1;
                changeMap.put(A[i], tmp);
                maxChange = tmp > maxChange ? tmp : maxChange;
            }
        }
        return computeResult(max, changeMap, N);
    }

    private int[] computeResult(int max, Map<Integer, Integer> changeMap, int N) {
        int[] result = new int[N];
        int change;
        for(int i = 0; i < N; i++) {
            change = changeMap.get(i + 1) == null ? 0 : changeMap.get(i + 1);
            result[i] = max + change;
        }
        return result;
    }

    private int getMaxOld(Map<Integer, Integer> changeMap) {
        Map.Entry<Integer, Integer> maxEntry = Collections.max(changeMap.entrySet(), Comparator.comparing(Map.Entry::getValue));
        return maxEntry.getValue();
    }

    public int[] solutionOld(int N, int[] A) {
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
