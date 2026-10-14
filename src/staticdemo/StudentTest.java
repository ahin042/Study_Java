package staticdemo;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.setStudentName("권아인");
        System.out.println(student1.getStudentName()
                + student1.getStudentID());
        System.out.println(Student.serialNum);
//        student1.serialNum++;

        student2.setStudentName("유가현");
        System.out.println(student2.getStudentName()
                + student2.getStudentID());
//        student2.serialNum++;

        student1.setStudentName("권아인");
        System.out.println(student1.getStudentName()
                + student1.getStudentID());
//        student1.serialNum++;
    }
}