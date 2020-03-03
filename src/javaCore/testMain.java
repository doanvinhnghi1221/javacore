package javaCore;

public class testMain {
    int i = 1000;
    long l = 1000L;

    double d = 3.54;
    float f = 3.54f;

    char c = 'L';
    String s = "This is a string";

    boolean b = false;

    int i1 = 9;
    double double1 = i1;

    double myDouble = 9.78;
    int myInt = (int) myDouble;

    double tinhTong(double a, double b) {
//        System.out.println(++i1);
//        a = a + 1; // a += 1;
//        boolean b1 = (a != 3.0);
//        System.out.println(b1);
        return a + b;
    }

    int max(int a, int b) {
        // cach 1:
//        return(Math.max(a, b));
        // cah 2:
        if (a > b) {
            return a;
        } else {
            return b;
        }
        // hoac:
//        return (a>b) ? a : b;
    }

    public static void main(String[] args) {
//        double a = 1.5;
//        double b = 2;
//        System.out.println(a+b); // boiler plate , redundant code, hard code
        testMain t = new testMain(); // khoi tao class variable
        //double res = t.tinhTong(2,4);
        //System.out.println(res);

        System.out.println(t.max(6, 4));

        //System.out.println(t.tinhTong(1, 1.5));
        //System.out.println(t.tinhTong(2.5, 2));


    }
}
