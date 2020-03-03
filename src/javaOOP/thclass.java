package javaOOP;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class thclass {
    /*int x;
    public thclass(int y){
        x = y;
    }

    public static void main(String[] args) {
        thclass obj = new thclass(5);
        System.out.println(obj.x);
        System.out.println("-----------");*/
    /*    String inputname;
        int inputnamsinh;
    public thclass (int nam, String name){
       inputname = name;
       inputnamsinh = nam;
    }

    public static void main(String[] args) {
        thclass lylich = new thclass(1996, "Nghi");
        System.out.println("tên " + lylich.inputname  +" , " + "sinh năm " + lylich.inputnamsinh);
    }*/
   /* String ten;
    boolean sinhsong;
    int tuoi;

    public thclass(String ten1, boolean Nhật, int tuoi1) {
        System.out.println("Bảng so sánh 2 loại chó");
        ten= ten1;
        sinhsong= Nhật;
        tuoi= tuoi1;
    }
    public static void main(String[] args) {
        System.out.println("LOVE DOG");
        thclass dog = new thclass("husky", false, 10);
        thclass dog1 = new thclass("shiba inu", true, 12);
        boolean sosanhtuoi = dog.tuoi > dog1.tuoi;
        int total = dog.tuoi + dog1.tuoi;
        System.out.println("có 2 loài chó: 1 con là " + dog.ten + " và 1 con là " + dog1.ten);
        System.out.println("So sánh tuổi TB: chó husky cao hơn shiba: " + sosanhtuoi);
        System.out.println("nguồn gốc: Alaska ở Hàn? " + dog.sinhsong + ", Shiba Inu ở Nhật? " + dog1.sinhsong);
        System.out.println("tổng số tuổi TB: " + total );
        System.out.println("hết!");
    }*/
    //scope
    /*String hay;
    int lắm;
   public thclass(String á, int a){
       hay = á;
       lắm = a;
   }
   public void haylam (String good){
System.out.println("dám uýnh t à .. " + good + " " + lắm);
   }
public void ngon ( int q){
 String c = "thích thì gọi " + q + " đi. T sợ quá ... " + hay   ;
 System.out.println(c);
}
   public static void main ( String[] args){
       thclass select = new thclass("uhuu", 113);
       select.haylam("t sẽ gọi");
select.ngon(113);
   }*/
    // Reassigning Instance Fields
    String productType;
    double price;

    public thclass(String product, double initialPrice) {
        productType = product;
        price = initialPrice;
    }

    public void increasePrice(double priceToAdd) {
        double newPrice = price + priceToAdd;
        price = newPrice;
        System.out.println("tăng giá lên 1.5:");
    }

    public static void main(String[] args) {
        thclass lemonadeStand = new thclass("Lemonade", 3.75);
        System.out.println(lemonadeStand.productType);
        System.out.println("giá ban đầu");
        System.out.println(lemonadeStand.price);
        lemonadeStand.increasePrice(1.5);
        System.out.println(lemonadeStand.price);
    }
}


