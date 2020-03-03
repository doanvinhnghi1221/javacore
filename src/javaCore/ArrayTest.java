package javaCore;

public class ArrayTest {

    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        try {
            String car1 = cars[0];
            System.out.println(car1);
            System.out.println(cars[5]);
            int l = cars.length;
            System.out.println(l);
        } catch (Exception e) { // handle
            System.out.println("Sth went wrong");
        }


        System.out.println("----------Cách 3------------");
        for (String s : cars) {
            System.out.println(s + " " + "car");
        }

        System.out.println("----------Cách 1------------");
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        System.out.println("----------Cách 2------------");
        int j = 0;
        while (j < cars.length) {
            System.out.println(cars[j]);
            j++; // j=j+1;
        }

        int kq = 0;
        for (int i = 1; i < 11; i++) { // i=1 i=2 i=3
            kq = kq + i; // kq =1 -> kq = 1+2-> kq = 1+2+3+4+...+10
        }
//        System.out.println(kq);

    }

}