package javaOOP;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class override extends o1 {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.add("A");


        override o = new override();
        o.show();
        System.out.println(o.tinh(3));
    }

    void show() {
        System.out.println("k được chạy");
    }

    public int tinh(int a) {
        return a + 2;
    }

    public Overload create() throws FileNotFoundException {
        return new Overload();
    }
}

class o1 {
    void show() {
        System.out.println("chạy");
    }

    public int tinh(int a) {
        return a;
    }

    public Overload create() throws IOException {
        return new Overload();
    }
}

