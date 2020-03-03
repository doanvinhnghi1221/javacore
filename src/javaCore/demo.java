package javaCore;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        System.out.println("vinh nghi");
      /*  String s1 = " hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = new String("hello");
        String s5 = new String("hello");
        System.out.println(s1);

        long startTime = System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer("Hello");
        for (int i=0; i<100000; i++){
            buffer.append("Word");
        }
        System.out.println("StringBuffer is: " + (System.currentTimeMillis() - startTime) + "ms");
        startTime = System.currentTimeMillis();
        StringBuilder buider = new StringBuilder("Hello");
        for (int i=0; i<100000; i++){
            buider.append("Word");
        }
        System.out.println("StringBuilder is: " + (System.currentTimeMillis() - startTime) + "ms");*/
        /*System.out.println("-------if else---------");
        int i = 1;
        if (i > 1) {
            System.out.println("chính xác");
        } else
            System.out.println("sai bét");*/
        /*System.out.println("------- switch case---------");
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" các ngày trong tuần ");
        i = scanner.nextInt();
        switch (i){
            case 1:
                System.out.println("ngay 1");
                break;
            case 2:
                System.out.println("ngay 2");
                break;
            case 3:
                System.out.println("ngay 3");
                break;
            default:
                System.out.println(" cuối tuần");
        }*/
        String tuthe[] = {"chay", "di", "dung", "nam"};
        for (String i : tuthe) {
            System.out.println(i);
        }
        System.out.println("-----");
        int mynum[] = {10, 20, 30, 40};
        for (int y : mynum) {
            System.out.println(y);
        }
        System.out.println("------");
        int[][] number = {{1, 2, 3, 4}, {5, 6, 7}};
        for (int i = 0; i < number.length; ++i) {
            for (int j = 0; j < number[i].length; ++j) {
                System.out.println(number[i][j]);
            }
        }
    }
}
