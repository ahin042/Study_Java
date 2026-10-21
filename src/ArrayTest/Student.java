package ArrayTest;

public class Student {
    private int id = 1000;
    private String name;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void showInfo() {
        System.out.println("학번: " + id + ", 이름: " + name);
    }

}
