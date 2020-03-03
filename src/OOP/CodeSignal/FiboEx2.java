package OOP.CodeSignal;

public class FiboEx2 {
    public static int fibo(int n) {
        int fn = 1;
        if (n == 0) {
            return n;
        }
        if (n > 1) {
            fn = fibo(n - 2) + fibo(n - 1);
        }
        return fn;
    }

    public static void main(String[] args) {
        System.out.println("dãy số fibonacci");
        for (int i = 0; i < 11; i++) {
            System.out.print(fibo(i) + " ");
        }
    }
}
