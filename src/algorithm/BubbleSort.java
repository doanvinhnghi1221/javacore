package algorithm;

public class BubbleSort {
    static void bubblesort(int arr[]) {
        int swap = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j - 1] > arr[j]) {
                    swap = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = swap;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {9, 2, 3, 78, 1, 45, 23, 12, 11};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        bubblesort(arr);
        System.out.println("sắp xếp dãy số hoàn thành: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

