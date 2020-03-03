package javaCore;

public class String_StringBuilder_StringBuffer {

    public static void main(String[] args) {
        String s1 = "Hello"; // kieu nguyen thuy
        String s2 = "Hello";
        String s3 = s1;
        String s4 = new String("Hello"); // kieu doi tuong / kieu class, s4: class variable
        String s5 = new String("Hello");
        System.out.println("s1 = s1 : " + (s1 == s1)); //hoac đặt breakpoint để xem kqua: boolean a = s1 == s1;      // true
        System.out.println("s1 = s2 : " + (s1 == s2));         // true
        System.out.println("s1 = s3 : " + (s1 == s3));         // true
        System.out.println("s1 = s4 : " + (s1 == s4));         // false
        System.out.println("s4 = s5 : " + (s4 == s5));      // false

        System.out.println("---------");
        System.out.println(s1.equals(s3));    // true, cùng nội dung
        System.out.println(s1.equals(s4));    // true, cùng nội dung
        System.out.println(s4.equals(s5));    // true, cùng nội dung.

        String st = "a";
        for (int i = 0; i < 100; i++) {
            st = st + i; // khoi tao 100 bien
        }
        System.out.println(st);

        StringBuilder sb = new StringBuilder("a"); // StringBuilder: nhanh hơn (chay dc 2 luong dong thoi /bất dong bo (non-synchronized))
        for (int i = 0; i < 100; i++) {
            sb.append(i); // khởi tạo 1 biến ban đầu là sb, sau đó cập nhật giá trị vào biến này => tiết kiệm bộ nhớ
        }
        System.out.println(sb);

        StringBuffer sf = new StringBuffer("a"); // hoac dùng StringBuffer
        for (int i = 0; i < 100; i++) {
            sf.append(i); // khởi tạo 1 biến ban đầu là sb, sau đó cập nhật giá trị vào biến này => tiết kiệm bộ nhớ
        }
        System.out.println(sf); // StringBuffer: chậm hơn , vì nó chạy dong bộ(chay tung luong một) => an toàn hơn
    }
}
