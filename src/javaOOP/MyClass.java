package javaOOP; // jar

// Constructor
public class MyClass { // class có the chua instance variable (biến) và method (pthuc)
    int x;  // Create a class attribute (instance var), tuong trung cho du lieu của lop.
    // neu ko khai báo biến instance, thì mặc định là 0, null, false (x là 0)

    // Create a class constructor for the MyClass class
    public MyClass() { // constructor, là 1 method đặc biệt,tên của nó là tên của class. Contructor có thể có tham số, hoặc ko tham số (như trong t/h này)
        x = 5;  // Set the initial value for the class attribute x
    }

    public MyClass(int y) { // constructor có tham số y
        x = y;
    }

    public int tinhX() {
        int d = 1; // d ko có gtri , ko có = 0 như biến x , d là bien local (nam trong 1 method)
        x = 100;
        return x;
    }

    public static void main(String[] args) { // hàm main (method)
        MyClass myObj = new MyClass(); // Create an object of class MyClass (This will call the constructor)
        System.out.println(myObj.x); // Print the value of x

        System.out.println(myObj.tinhX());

        MyClass myObj2 = new MyClass(9);
        System.out.println(myObj2.x);

    }
}

// Outputs 5
