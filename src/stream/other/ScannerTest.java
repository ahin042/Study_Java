package stream.other;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름: ");
        String name = sc.next();

        System.out.print("사원번호: ");
        int id = sc.nextInt();

        System.out.print("직업: ");
        String job = sc.next();

        System.out.println("이름: " + name);
        System.out.println("사원번호: " + id);
        System.out.println("직업: " + job);

    }
}