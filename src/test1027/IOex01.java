package test1027;

import java.util.Scanner;

public class IOex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        for (int i = 0; i < 10; i++) {
            a += scanner.nextInt();
        }
        System.out.print("합: " + a);
        System.out.printf("평균: %.1f", (double) a / 10);
    }
}
