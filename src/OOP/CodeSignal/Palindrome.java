package OOP.CodeSignal;

public class Palindrome {

    boolean checkPalindrome(String arr) {
        char[] word = arr.toCharArray();
//            int i1 = 0;
////            int i2 = word.length - 1;
////            while (i2 > i1) {
////                if (word[i1] != word[i2]) {
////                    return false;
////                }
////                ++i1;
////                --i2;
////            }
////            return true;
        int j = word.length;
        for (int i = 0; i < j / 2; i++) {
            if (word[i] != word[j - 1]) {
                return false;
            }
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String word = "abba"; // abcdcba;
        Palindrome pa = new Palindrome();
        System.out.println(pa.checkPalindrome(word));
    }
}
