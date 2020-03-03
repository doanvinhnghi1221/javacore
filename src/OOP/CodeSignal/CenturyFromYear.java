package OOP.CodeSignal;

public class CenturyFromYear {
    static int centuryFromYear(int year) {

        if (year <= 0) {
            return 0;
        } else if (year <= 100) {
            return 1;
        } else if (year % 100 == 0) {
            return year / 100;
        } else {
            return (year / 100) + 1;
        }
    }

    public static void main(String[] args) {
        System.out.println("năm 3221 thuộc thế kỉ thứ :");
        System.out.println(centuryFromYear(789));
    }
}
