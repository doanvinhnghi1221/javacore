package javaOOP;

import jdk.swing.interop.SwingInterOpUtils;

public class Enum {
    enum COLOR {
        xanh(1), đỏ(2), tím(3), vàng(4);
        private int value;

        COLOR(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        System.out.println(COLOR.xanh);
        COLOR x = COLOR.đỏ;
        System.out.println(x);
        System.out.println(x.tím);
        System.out.println(x + " :" + x.value);
        if (x == COLOR.vàng) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        switch (x) {
            case đỏ:
                System.out.println("đỏ");
                break;
            case tím:
                System.out.println("tím");
                break;
            case vàng:
                System.out.println("vàng");
                break;
            case xanh:
                System.out.println("xanh");
                break;
        }
    }
}