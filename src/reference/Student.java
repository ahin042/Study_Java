package reference;

public class Student {
    int studentId;
    String studentName;

    Subject korea = new Subject();
    Subject java = new Subject();

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;

        korea = new Subject();
        java = new Subject();
    }

    public void setKoreaSubject(String subjectName, int score) {
        korea.setSubjectName(subjectName);
        korea.setScorePoint(score);
    }

    public void setJavaSubject(String subjectName, int score) {
        java.setSubjectName(subjectName);
        java.setScorePoint(score);
    }

    public void showStudentInfo() {
        System.out.println(studentName + "님의 " + korea.getSubjectName() + "의 성적은 " + korea.scorePoint + "점이고, "
        + java.getSubjectName() + "의 성적은 " + java.scorePoint + "점입니다.");
    }
}
