package hiding.developer;

import hiding.company.Employee;

public class Developer extends Employee {
    public void printInfo() {
        Employee emp = new Employee();
        System.out.println(name); // 어디서나 접근 가능
        System.out.println(department);
    }
}
