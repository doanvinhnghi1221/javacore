package OOP.CodeSignal;

import com.sun.source.tree.ArrayAccessTree;

public class Adjacent {
    int adjacentLargest(int[] Array) {
        int t = Array[0] * Array[1];
        for (int i = 1; i < Array.length - 1; i++) {
            if (t > Array[i] * Array[i + 1]) {
                continue;
            } else {
                t = Array[i] * Array[i + 1];
            }
        }
        return t;
    }

    public static void main(String[] args) {
        int[] Array = {-5, 6, -4, 2, 3, 2, -23};
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + " ");
        }
        Adjacent adj = new Adjacent();
        System.out.println();
        System.out.println(adj.adjacentLargest(Array));
    }
}