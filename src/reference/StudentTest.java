package reference;

public class StudentTest {
    public static void main(String[] args) {
        Student studentKwon = new Student(1001, "권아인");
        Student studentKang = new Student(1002, "강민준");

        studentKwon.setKoreaSubject("국어", 80);
        studentKwon.setJavaSubject("자바", 100);

        studentKang.setKoreaSubject("국어", 85);
        studentKang.setJavaSubject("자바", 90);


        studentKwon.showStudentInfo();
        studentKang.showStudentInfo();
    }
}
