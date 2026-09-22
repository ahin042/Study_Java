package reference;

public class Student {
    int studentId;
    String studentName;

    Subject korea = new Subject();
    Subject java = new Subject();

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }
}
