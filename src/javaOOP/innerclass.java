package javaOOP;
//Chúng ta sử dụng inner class để nhóm các lớp và các interface một cách logic lại với nhau ở một nơi để giúp cho code dễ đọc và dẽ bảo trì hơn.

//     Thêm vào đó, nó có thể truy cập tất cả các thành viên của lớp bên ngoài (outer class) bao gồm các thành viên dữ liệu private
//     và phương thức.

import org.w3c.dom.ls.LSOutput;

public class innerclass {
    public static void main(String[] args) {
        ourner n = new ourner();
        n.lop();
        ourner.inner a = n.new inner();
        System.out.println("vắng :" + (a.vang + n.vang));
    }
}

class ourner {
    int vang = 1;

    public void lop() {
        B_2 n = new B_2();
        n.Lop();

    }

    class inner {
        int vang = 2;

    }
}

class B_2 {
    public void Lop() {
        System.out.println("lớp 10B_2");
        D_2 n = new D_2();
        n.LOP();
    }
}

class D_2 {
    public void LOP() {
        int sl = 30;
        System.out.println("tổng số học sinh = " + sl);
    }
}