package staticdemo;

public class Student {
    public static int serialNum = 1200 ;
    private String studentName; // 이름
    private int studentID = 1000;
    private int grade; // 학년
    private String address; // 주소

    public Student() {
        serialNum++;
        studentID = serialNum;
    }

    public static int getSerialNum() {
        int i = 10;
        return serialNum;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentID() {
        return studentID;
    }
}
