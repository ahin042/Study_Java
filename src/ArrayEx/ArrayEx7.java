package ArrayEx;

public class ArrayEx7 {
    public static void main(String[] args) {
        char[] alpha1 = new char[13];
        char[] alpha2 = new char[13];
        char[] alpha = new char[26];
        char ch = 'A';

        for (int i = 0; i < alpha1.length; i++) {
            alpha1[i] = ch;
            ch++;
        }

        for (int i = 0; i < alpha2.length; i++) {
            alpha2[i] = ch;
            ch++;
        }

        System.arraycopy(alpha1, 0, alpha, 0, alpha1.length);
        System.arraycopy(alpha2, 0, alpha, alpha1.length, alpha2.length);

        for (char c : alpha) {
            System.out.print(c);
        }
    }
}