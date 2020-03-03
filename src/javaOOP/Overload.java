package javaOOP;

//Overload dc dùng :khi thực hiện 1 method cùng tên nhưng làm nhiều cv khác
//bắng cách: thay đổi số đối số truyền vào: ad(a,b) & ad(a,b,c)
//          - thay đổi kiểu dữ kiệu: int , float, char..
//          - thay đổi trình tự kiểu dữ liệu : ad(int, char) ad(char,int)
public class Overload extends noname {
    public static void main(String[] args) {
        Overload i = new Overload();
        System.out.println(i.add(3, 5));
        System.out.println(i.add(3.0f, 5.0f));
        System.out.println(i.add("Bụi bay ", "vào mắt"));
    }

    public int add(int a, int b) {
        return a + b;
    }

    public float add(float a, float b) {
        return a + b;
    }
}

class noname {
    public String add(String s1, String s2) {
        return s1 + s2;
    }
}


