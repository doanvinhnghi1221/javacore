package algorithm;

public class BinarySearch {
    private static int binarysearch(int arr[], int x) {
        int min = 0;
        int max = arr.length - 1;
        int mid = 0;
        while (min <= max) {
            mid = (min + max) / 2;
            if (x == arr[mid]) {
                return mid;
            } else if (x > arr[mid]) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 8, 9, 13, 24, 55};
        System.out.println("dãy số array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("tìm thấy 55 tại index: " + binarysearch(arr, 55));
    }
}


