package javaOOP;

// try_catch dùng để xử lý ngoại lệ
public class try_catch {
    public static void main(String[] args) throws InterruptedException {
        try {
            String a = "nghi";
            System.out.println(a.substring(2));
            int x = 10;
            int y = 0;
            int z = 30;
            System.out.println("x + y = " + (x + y));
            System.out.println("x - y = " + (x - y));
            System.out.println("x/y = " + x / y);
            System.out.println("z/x = " + z / x);
        } catch (Exception e) {
            System.out.println("error: " + e.toString());
        } finally {
            System.out.println("lỗi");
        }
        System.out.println("Dừng chạy");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}




