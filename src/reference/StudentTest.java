package reference;

public class StudentTest {
    public static void main(String[] args) {
        Student studentKwon = new Student(1001, "권아인");

        studentKwon.setKoreaSubject("국어", 80);
        studentKwon.setJavaSubject("자바", 100);

        studentKwon.showStudentInfo();
    }
}
