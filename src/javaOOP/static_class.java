package javaOOP;

import OOP2.inter_abs;

public class static_class {
    public static void main(String[] args) {
        room r = new room();
        r.number = 5;
        System.out.println("room 1 = " + r.number);
        System.out.println("before = " + room.tang); // static k cần khởi tạo
        r.tang = 100;
        System.out.println("after = " + r.tang);

        room r1 = new room();
        r1.number = 10;
        System.out.println("room 2 = " + r1.number);
        room.tang = 150;
        System.out.println("after = " + r1.tang);

        room r2 = new room();
        r2.number = 15;
        System.out.println("room 3 = " + r2.number);
        System.out.println("after = " + r2.tang);

        room.show();
        System.out.println(r.tang); //kq ra 300


    }
}

class room {
    static int tang = 50;
    int number;

    public static void show() {
        System.out.println("show");
        tang = 300; //k bị báo lỗi khi trùng tên
    }
}
