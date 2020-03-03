
package javaOOP;

import java.util.Scanner;

public class thuchanhClass {
    int x;
    int y;
    int z;

    static void sttmethod() {
        System.out.println("phương thức tĩnh không cần tạo  Obj");
    }

    public void plmethod(int q) {
        System.out.println("phương thức công cộng cần có Obj " + "---" + q);
    }

    public void phim() {
        System.out.println("phim kinh dị");
    }

    public static void main(String[] args) {
        thuchanhClass Obj = new thuchanhClass();
        Obj.y = 1;
        System.out.println(Obj.x);
        System.out.println(Obj.y); //kq k ra 2
        sttmethod();
        Obj.plmethod(23);
        Obj.phim();
    }
}

class myclass {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");
        String userName = myObj.nextLine();
        System.out.println("Username is: " + userName);
    }
}
