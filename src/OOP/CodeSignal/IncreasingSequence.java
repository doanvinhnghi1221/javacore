package OOP.CodeSignal;

public class IncreasingSequence {
    boolean isAlmostIncreasingSequence(int[] sequence) {
        int removed = 0;
        for (int i = 0; i < sequence.length - 2 && removed <= 1; i++) {
            int a = sequence[i];
            int b = sequence[i + 1];
            int c = sequence[i + 2];
            if (a >= b) {
                removed++;
                sequence[i] = b - 1;
            }
            if (b >= c) {
                removed++;
                if (a == c) {
                    sequence[i + 2] = b + 1;
                } else {
                    sequence[i + 1] = a;
                }
            }
        }
        return removed <= 1;
    }

    public static void main(String[] args) {
        int[] sequence = {-1, 2, 7, 4, 7, 9, 67};
        IncreasingSequence iS = new IncreasingSequence();
        System.out.println(iS.isAlmostIncreasingSequence(sequence));
    }
}
