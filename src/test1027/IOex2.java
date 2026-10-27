package test1027;

import java.util.ArrayList;
import java.util.Scanner;

public class IOex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i :a) {
            System.out.print(i + " ");
        }

    }
}
