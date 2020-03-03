package OOP2;

import jdk.swing.interop.SwingInterOpUtils;

public class inter_abs {
    public static void main(String[] args) {
        truong_cap1 t1 = new truong_cap1();
        timet t2 = new timet();
        t1.setSchoolname("Phan Rí Thành ");
        t2.setTime(3);
        System.out.println(t1.getSchoolname() + t2.getTime());

        khoi k = new khoi();
        k.lop();
        khoi k1 = new khoi();
        k.number();
    }
}

class truong_cap1 {
    private String schoolname;

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    public String getSchoolname() {
        return schoolname;
    }
}

class timet {
    private int time;

    public void setTime(int time) {
        this.time = time;
    }

    public int getTime() {
        return time;
    }
}

interface thcs {
    public final static String n_name = "Đoàn Vĩnh Nghi";
    int sbd = 16;
    int l = 6;

    public abstract void lop();

    void number();
}

class khoi implements thcs {

    @Override
    public void lop() {
        System.out.println(n_name + " Lớp " + l);
    }

    @Override
    public void number() {
        System.out.println("sbd: " + sbd);
    }
}

abstract class thpt {
    private String a;

    public abstract void b();

    void c() {

    }
}

