package OOP2;

public class B {
    A41 oibj;

    B(A41 obj) {
        this.oibj = obj;
    }

    void display() {
        System.out.println(oibj.daata);// sử dụng biến thành viên cửa lớp A4
    }
}

class A41 {
    int daata = 10;

    A41() {
        B b = new B(this);
        b.display();
    }

    public static void main(String args[]) {
        A41 a = new A41();
    }
}
