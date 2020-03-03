package OOP2;

import org.w3c.dom.ls.LSOutput;

public class Person {
    protected String name; // instance var, default String = null

    public Person() { // constructor ko tham số
    }

    public Person(String name) { // constructor có tham số
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
