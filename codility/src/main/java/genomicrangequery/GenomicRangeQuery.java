package genomicrangequery;

import java.util.HashMap;
import java.util.Map;

public class GenomicRangeQuery {
    public int[] solution(String S, int[] P, int[] Q) {
        int[][] genoms = new int[3][S.length()+1];
        short a, c, g;
        for (int i=0; i<S.length(); i++) {
            a = 0; c = 0; g = 0;
            if ('A' == (S.charAt(i))) {
                a=1;
            }
            if ('C' == (S.charAt(i))) {
                c=1;
            }
            if ('G' == (S.charAt(i))) {
                g=1;
            }
            genoms[0][i+1] = genoms[0][i] + a;
            genoms[1][i+1] = genoms[1][i] + c;
            genoms[2][i+1] = genoms[2][i] + g;
        }

        int[] result = new int[P.length];
        for (int i=0; i<P.length; i++) {
            int fromIndex = P[i];
            int toIndex = Q[i]+1;
            if (genoms[0][toIndex] - genoms[0][fromIndex] > 0) {
                result[i] = 1;
            } else if (genoms[1][toIndex] - genoms[1][fromIndex] > 0) {
                result[i] = 2;
            } else if (genoms[2][toIndex] - genoms[2][fromIndex] > 0) {
                result[i] = 3;
            } else {
                result[i] = 4;
            }
        }

        return result;
    }

    public int[] solutionOld(String S, int[] P, int[] Q) {
        Map<String, Integer> factorMap = new HashMap<>();
        factorMap.put("A", 1);
        factorMap.put("C", 2);
        factorMap.put("G", 3);
        factorMap.put("T", 4);

        int[] E = new int[P.length];
        int localMin;
        for (int i = 0; i < E.length; i++) {
            localMin = factorMap.get(String.valueOf(S.charAt(P[i])));
            int tmp;
            for (int j = P[i]; j <= Q[i]; j++) {
                tmp = factorMap.get(String.valueOf(S.charAt(j)));
                if (tmp < localMin) localMin = tmp;
                if (localMin == 1) continue;
            }
            E[i] = localMin;
        }
        return E;
    }
}