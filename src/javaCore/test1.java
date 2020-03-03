package javaCore;

public class test1 { // test1: đối tượng
    // 1 class gồm:
    //field/instance variable: data của lop test1
    // method: pthuc xừ lý data
    int g = 1; // global variable

    public int add(int a, int b) { // parameter: a,b; method/hàm: add
        int c = a + b + g; // local variable
        return c;
    }

    public static void main(String[] args) { // arguments
        test1 t1 = new test1(); // khởi tạo instance 1 class
        System.out.println(t1.add(3, 5));
        System.out.println(t1.add(4, 6));
        test2 t2 = new test2();
        int result = t2.add(2, 9);
        System.out.println(result);
        String s1 = " hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = new String("hello");
        String s5 = new String("hello");
        System.out.println(s1);
    }
}

class test2 {
    // parameter: a,b; method/hàm: add
    public int add(int a, int b) { // parameter: a,b; method/hàm: add
        int c = a * b; // local variable
        return c;
    }

}
