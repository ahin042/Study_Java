package HashMap;

import java.util.Scanner;

public class StudentGradeManagerMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentGradeManager student = new StudentGradeManager();

        System.out.print("Number Of Student : ");
        int a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.print("Add Student name : ");
            String name = scanner.next();
            System.out.print("Add Student score : ");
            int score = scanner.nextInt();
            student.add(name,score);
        }

        System.out.print("Want To Remove? (yes or no) : ");
        String say = scanner.next();
        if (say == "yes") {
            System.out.print("How Much? (Number) : ");
            a = scanner.nextInt();
            for (int i = 0; i < a; i++) {
                System.out.print("Add Student Name : ");
                String name = scanner.next();
                student.remove(name);
            }
        }
        else if (say == "no") {
            System.out.println("Ok");
        }
        else {
            System.out.println("I can't Understand");
        }

        System.out.println("Want To See? (yes or no) : ");
        say = scanner.next();
        if (say == "yes") {
            System.out.println("Ok");
            System.out.print("Add Student Name : ");
            String name = scanner.next();
            student.see(name);
        }
        else if (say == "no") {
            System.out.println("It's Ok");
        }
        else {
            System.out.println("I can't Understand");
        }

        System.out.println("END");
    }
}
