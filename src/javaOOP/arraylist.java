package javaOOP;

import java.util.ArrayList;
import java.util.Vector;

public class arraylist {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();    //arraylist  k đồng bộ
        al.add("ArrayList");
        al.add(new String("thứ 2"));
        al.add(new Integer(3));
        al.add(new Long(4));
        System.out.println(al.get(0));
        System.out.println(al.get(1));
        System.out.println(al.get(2));
        System.out.println(al.get(3));
        al.remove(0);
        System.out.println(al.get(0)); // bị remove 0 tiếp tục in ra 1
        System.out.println(al);
        Object[] array = al.toArray();
        System.out.println(array.length);
        System.out.println(al.size());
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
        System.out.println("------------");
        Vector v = new Vector();          //Vector đồng bộ
        v.add("Vector");
        v.add(new String("tháng 1"));
        v.add(new Integer(2));
        v.add(new Long(3));
        System.out.println(v.get(0));
        System.out.println(v.get(1));
        System.out.println(v.get(2));
        System.out.println(v.get(3));
//        Collections.sort(myNumbers);
        System.out.println("----");
        for (Object i : v) {
            System.out.println(i);
        }
        System.out.println("---");
        v.set(0, "Xin chào");
        System.out.println(v);
        v.remove(0);
        System.out.println(v);
        System.out.println(v.get(0));
        System.out.println(v.size());
        System.out.println("---");
        /*v.clear();
        System.out.println(v);*/
        for (int x = 0; x < v.size(); x++) {
            System.out.println(v.get(x));
        }
    }
}
