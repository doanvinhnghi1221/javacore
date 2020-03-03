package javaOOP;

public class thuake {
    public static void main(String[] args) {
        universe_book ub = new universe_book();
        ub.move();
        ub.show();
        ub.display();
    }
}


interface book {
    void show();
}

interface animal_book extends book {
    void move();
}

class vege_book implements animal_book {

    @Override
    public void show() {
        System.out.println("Cây bàng");
    }

    public void move() {
        System.out.println("Cây dừa");
    }
}

class universe_book extends vege_book implements animal_book, book {
    public void display() {
        System.out.println("Vũ trụ");
    }
}