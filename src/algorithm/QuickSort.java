package algorithm;


public class QuickSort {

    int partition(int arr[], int low, int high) { // 10,13,7,80,30,90,40,50,45
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    void sort(int arr[], int min, int max) {
        if (min < max) {
            int pi = partition(arr, min, max);
            sort(arr, min, pi - 1);
            sort(arr, pi + 1, max);
        }
    }

    public static void main(String args[]) {
        int arr[] = {10, 13, 7, 80, 30, 90, 40, 50, 45};
        QuickSort q = new QuickSort();
        q.sort(arr, 0, arr.length - 1);
        System.out.println("sorted array");
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

