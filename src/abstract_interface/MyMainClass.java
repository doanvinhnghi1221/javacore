package abstract_interface;

abstract class Animal {
    public abstract void animalSound();

    public void sleep() {
        System.out.println("Zzz");
    }
}

class Pig extends Animal {

    @Override // ghi đè
    public void animalSound() { // implement: thực thi / kế thừa
        // do something
        System.out.println("The pig says: wee wee");
    }
}

class MyMainClass {
    public static void main(String[] args) {
        Animal pig = new Pig();
        pig.animalSound();
        pig.sleep();
    }
}

