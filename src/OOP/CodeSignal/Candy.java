package OOP.CodeSignal;

public class Candy {
    public static int candies(int n, int m) {
        if (n < 1) {
            return m;
        } else {
            return m - ((m / n) * n); // -4- (-4/1)*1 = -4 - -4 = -4 +4 = 0;
        }
        /* return n<1 ? m : m%n; // 5%4= 1*/
    }

    public static void main(String[] args) {
        // Candy c = new Candy(); c.candies(4,5);
        int kq = Candy.candies(1, 5);
        System.out.println(kq);
    }
}
