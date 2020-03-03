package OOP.CodeSignal;

public class Fibonacci {
    public static int fibonacci(int n) {
        int f0 = 0, f1 = 1, fn = 1;
        if (n == 0) {
            return n;
        }
        for (int i = 2; i < n; i++) {
            f0 = f1;
            f1 = fn;
            fn = f0 + f1;
        }
        return fn;
    }

    public static void main(String[] args) {
        System.out.println("dãy số Fibonacci");
        for (int i = 0; i < 11; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
