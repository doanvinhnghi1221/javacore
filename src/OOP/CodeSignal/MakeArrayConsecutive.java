package OOP.CodeSignal;

public class MakeArrayConsecutive {
    static int makeArrayConsecutive2(int[] statues) {
       /*
        int max = -50;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < statues.length; i++) {
            max = Math.max(max, statues[i]);
            min = Math.min(min, statues[i]);
        }
        return (max - min) + 1 - statues.length;     */

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < statues.length; i++) {
            if (statues[i] < min) {
                min = statues[i];
            }
            if (statues[i] > max) {
                max = statues[i];
            }
        }
        return (max - min) + 1 - statues.length;
    }

    public static void main(String[] args) {
        int statues[] = {3, 2, 10, 1};//20 - 35
        System.out.println(makeArrayConsecutive2(statues));
    }
}
