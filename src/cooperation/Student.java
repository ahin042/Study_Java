package cooperation;

public class Student {
    private String studentName; // 이름
    private int grade; // 학년
    private int money; // 가진 돈

    public Student(String studentName, int money) {
        this.studentName = studentName;
        this.money = money;
    }

    public void getBus(Bus bus) {
        bus.take();
        this.money -= 1000;

    }

    public void getSubway(Subway subway) {
        subway.take();
        this.money -= 1500;
    }

    public void showInfo() {
        System.out.println(studentName + "님의 잔액은 " + money + "원 입니다.");
    }
}
