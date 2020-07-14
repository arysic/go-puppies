package binarygap;

public class BinaryGap {
    public int solution(int N) {
        return getBinaryGap(NToBinaryString(N));
    }

    private String NToBinaryString (int N) {
        return Integer.toBinaryString(N);
    }

    private int getBinaryGap(String NBinaryRepresentation) {
        int index = 0, gap = 0;
        int newIndex = getIndex(NBinaryRepresentation, 1);
        while (newIndex > 0) {
            if (newIndex - index > 1) {
                gap = newIndex - index -1 > gap ? newIndex - index - 1 : gap;
            }
            index = newIndex;
            newIndex = getIndex(NBinaryRepresentation, index + 1);
        }
        return gap;
    }

    private int getIndex(String NBinaryRepresentation, int fromIndex) {
        return NBinaryRepresentation.indexOf("1", fromIndex);
    }
}
