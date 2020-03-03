package javaCore;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class baitap_java {
    public static void main(String[] args) {
        int tuoi = 60;
        System.out.println("tuổi hiện tại " + tuoi);
        if (tuoi > 40) {
            System.out.println("già mẹ rồi!");
        } else if (tuoi <= 15) {
            System.out.println("trẻ trâu");
        } else if (tuoi > 20) {
            System.out.println("ok!");
        }
        Boolean x = true;
        System.out.println("right?");
        if (x == true) {
            System.out.println(" đúng rồi");
        } else {
            System.out.println("sai");
        }
        System.out.println("kết thúc!");
        System.out.println("---------");
        int q = 15;
        System.out.println("bạn " + q + " tuổi");
        switch (q) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("chưa đủ tuổi học mẫu giáo");
                break;
            case 5:
                System.out.println("đủ tuổi học mẫu giáo");
                break;
            default:
                System.out.println("già đầu còn đi học mẫu giáo");
        }
        System.out.println("bye");
        System.out.println("------------");
        int w = 0;
        for (int a = 2; a <= 7; a++) {
            w++;
            System.out.println(w + " tuổi" + " đến " + a);
            switch (a) {
                case 2:
                    System.out.println("tự ăn");
                    break;
                case 3:
                case 4:
                    System.out.println("tập vẽ, học hỏi");
                    break;
                case 5:
                case 6:
                    System.out.println("đi học");
                    break;
                default:
                    System.out.println("lớn rồi");
            }
        }
        System.out.println("------------");
        int[][] ten = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        try {
            int l = ten.length;
            System.out.println(l);
            System.out.println("----");
            for (int i = 0; i < ten.length; i++) {
                for (int j = 0; j < ten[i].length; j++) {
                    System.out.println(ten[i][j]);
                }
            }
            System.out.println("----");
            System.out.println(ten[1][1]);
        } catch (Exception e) {
            System.out.println("sai");
        } finally {
            System.out.println("kết thúc");
        }
       /* int a = 1;
        int b = 0;
        int p = 10;
        while (a < 10 && b < 10) {
            a++;
            b += 2;
            System.out.println(a + " + " + b + " = " + p);
            switch ((a + b)) {
                case 10:
                    System.out.println("--> đúng");
                    break;
                case 4:
                case 7:
                case 13:
                case 16:
                    System.out.println("--> sai");
            }
            if ((a +b) == 10){
                System.out.println("---->");
                continue;
            }
            System.out.println("làm lại");
        }
int v = 1;
        System.out.println("cùng đếm nào");
        do {
            System.out.println("-->" + v);
            switch (v){
                case 1:
                    System.out.println("một");
                    break;
                case 2:
                    System.out.println("hai");
                    break;
                case 3:
                    System.out.println("ba");
                    break;
                case 4:
                    System.out.println("bốn");
                   break;
                case 5:
                    System.out.println("năm");
            }
            v++;
        }while (v < 6);*/
       /* System.out.println("---------String, Stringbuilder and StringBuffer---------");
        String s1 = "Nobita";
        String s2 = "Doraemon";
        String s3 = s1;
        String s4 = new String("Nobita");
        String s5 = new String("Xuka");
        System.out.println((s1==s2) + " " + (s1==s3) +" " + (s1==s4) + " " + (s1==s5));
        System.out.println("    equals:");
        System.out.println((s1.equals(s2)) + " " + (s1.equals(s3)) + " " + (s1.equals(s4)));
        String f = "còn";
        for (int w = 5; w > 0; w--){
            System.out.println(f + " "+ w +"p nữa");
        }
        System.out.println("kết thúc!");*/
    }
}