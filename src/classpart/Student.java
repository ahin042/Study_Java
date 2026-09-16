package classpart;

public class Student {
    int studentId;
    String studentName;
    int grade;
    String address;

    public void showStudentInfo() {
        System.out.println(studentName + " " + address);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.showStudentInfo();
    }
}
