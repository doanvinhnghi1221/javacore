package javaCore;

import java.util.Date;

public class loop {
    int i = 0; // instance variable
    int namSinh;

    int tinhTuoi(int namSinh) { // method
        int z = 10; // local var
        int tuoi = 2019 - namSinh;
        return tuoi; //return (2019 - namSinh);
    }
/*  int tinhTien(int soTien) {
        int z = 10;
        return soTien;
    }*/


    public static void main(String[] args) {
        loop l = new loop();
        int result = l.tinhTuoi(1996);
        System.out.println(result);

        // while loop
        int i = 5;
        while (i < 5) {
            System.out.println(i);
            i++;
            i = i + 1;
        }
        System.out.println("null");

        // do while
        int y = 4;
        do {
            System.out.println(y);
            y++;
            y += 2;
        }
        while (y < 4);// in ra 3 4
        System.out.println("Always prints");

        // for loop
    /*   int i = 0;
       i = 2;
       System.out.println(i);
        System.out.println("-----------------");
        for (i = 0; i < 5; i+=1) { // i = i+1
            System.out.println(i*2);
        }*/

        String car1 = "Volvo";
        String car2 = "BMW";
        // array
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String s : cars) {
            System.out.println(s + " " + "car");
        }

        // break
/*        for (int i = 1; i < 10; i++) {
            System.out.println(i);
            if (i == 6) {
                break;
            }

        }*/

       /* for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }*/

    }
}
