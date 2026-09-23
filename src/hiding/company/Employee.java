package hiding.company;

public class Employee {
    public String name;
    protected String department;
    String email; // 접근 제어자가 없으면 디폴트
    private int salary;

    public void printInfo() {
        System.out.println(name);
        System.out.println(department);
        System.out.println(email);
        System.out.println(salary);
    }
}
