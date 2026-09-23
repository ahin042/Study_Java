package hiding.company;

public class Manager {
    public static void main(String[] args) {
        Employee emp = new Employee();
        System.out.println(emp.name); // 어디서나 접근 가능
        System.out.println(emp.department);
        System.out.println(emp.email);
        // System.out.println(emp.salary);
    }
}
