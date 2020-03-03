package algorithm;

public class SelectionSort {
    static void selection(int arr[]) {
        //int n = arr.length;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {22, 7, 3, 13, 15, 11, 5, 1};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        SelectionSort.selection(arr); //selection(arr);
        System.out.println();
        System.out.println("đã sort xong");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
