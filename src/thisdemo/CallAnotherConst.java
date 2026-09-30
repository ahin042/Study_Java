package thisdemo;

public class CallAnotherConst {
    public static void main(String[] args) {
        Person noName = new Person("이름있음", 18);
        System.out.println(noName.name);
        System.out.println(noName.age);

        System.out.println(noName.returnItSelf());
        System.out.println(noName);
    }
}
