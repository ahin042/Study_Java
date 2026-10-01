package thisdemo;

public class ReturnItself {
    public static void main(String[] args) {
        Student student = new Student();

//        Student student1 = student.setId(1201);
//        Student student2 = student.setName("홍길동");
//        Student student3 = student.setGrade(1);

        student.setId(1201).setName("홍길동").setGrade(1).showStudentInfo(); // 체이닝 기법
    }
}
