package javaOOP;

public class Muticlasses {
    public static void main(String[] args) {
        ammi a1 = new ammi();
        a1.setName("Ammi");
        System.out.println(a1.getName());

        ammi a2 = new ammi();
        a2.setName("26 tuổi");
        System.out.println(a2.getName());

        anni b1 = new anni();

        Billi_pan n = new Billi_pan();
        n.show();
    }
}

class ammi {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class anni {

}

interface billi {
    public final static String name_n = "name";
    int tuoi = 60;

    public abstract void show();

    void sudy();
}

class Billi_pan implements billi {

    @Override
    public void show() {
        System.out.println(name_n + " tôi là Billi_pan! tôi " + tuoi + " tuổi.");
    }

    @Override
    public void sudy() {

    }
}

abstract class ceiji {
    private String name;

    public abstract void move();

    void display() {

    }
}

