package ArrayTest;

import array.Book;

import java.util.ArrayList;

public class StudentList {
    public static void main(String[] args) {
        String[] name = {"강하늘", "김도영", "박영현", "안세영", "우상혁", "최인호"};
        ArrayList<Student> studentlist = new ArrayList<>();
        int i = 1101;

        for (String n : name) {
            studentlist.add(new Student(n, i++));
        }

        for (Student s : studentlist) {
            s.showInfo();
        }
    }
}