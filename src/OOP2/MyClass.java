package OOP2;

public class MyClass {

    public static void main(String[] args) {

        System.out.println(Math.abs(-3.5)); // abs là pthuc static
        Person p = new Person();  // new Person(): gọi constructor mặc định ko tham số
        System.out.println(p.getName());

        Person p2 = new Person("Mai"); // new Person(): gọi constructor (có tham số truyen vào kiểu String)
        System.out.println(p2.getName());

        Person p3 = new Person("Đức");
        System.out.println(p3.getName());
    }
}
