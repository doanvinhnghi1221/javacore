package javaCore;

import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n < 5);

        int A[] = new int[n];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            A[i] = scanner.nextInt();
        }
        int B[] = {1, 3, 5, 2, 4};
        //Xuất giá trị các phần tử của mảng
        System.out.println("\nMảng ban đầu: ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + "\t");
        }

        // Tìm phần tử có giá trị lớn nhất, nhỏ nhất
        int max = A[0]; // khởi tạo phần tử lớn nhất là phần tử đầu tiên
        int min = A[0]; // khởi tạo phần tử bé nhất là phần tử đầu tiên

        for (int i = 0; i < 5; i++) {
            if (A[i] < min) {
                min = A[i];
            }

            if (A[i] > max) {
                max = A[i];
            }
        }
        System.out.print("\nPhần tử lớn nhất trong mảng là " + max);
        System.out.print("\nPhần tử nhỏ nhất trong mảng là " + min);

    }

}
