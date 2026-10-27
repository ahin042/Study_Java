package test1027;

import java.util.Scanner;

public class IOex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] a = new char[10];
        for (int i = 0; i < 10; i++) {
            a[i] = scanner.next().charAt(0);
        }
        for (char i :a) {
            System.out.print(i);
        }
    }
}
