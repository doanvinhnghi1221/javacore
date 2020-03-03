package OOP.CodeSignal;

public class InterestingPolygon {
    int shapeArea(int n) {
      /*  int area = 1;
        while (n > 1) {
        area += (n-- -1)*4;
        }
            return area;*/

        //   cách 2
        int i = 0;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            i = shapeArea(n - 1) + (n - 1) * 4;
        }
        return i;
    }

    public static void main(String[] args) {
        InterestingPolygon inPo = new InterestingPolygon();
        System.out.println(inPo.shapeArea(5));
    }
}
