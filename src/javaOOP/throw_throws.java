package javaOOP;

//Từ khoá throw trong java được sử dụng để ném ra một ngoại lệ cụ thể.
public class throw_throws {
    public static void main(String[] args) {
        building B = new building();
        try {
            B.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class i extends Exception {
}

class building {
    public void show() throws Exception {
        int number = 10;
        if (number > 0) {
            System.out.println("number : " + number);
            throw new Exception();
        }
    }

    public void move() throws InterruptedException {
        Thread.sleep(10);
    }

}

