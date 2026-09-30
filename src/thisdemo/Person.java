package thisdemo;

public class Person {
    String name;
    int age;

    Person() {
        this("이름없음",17);
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person returnItSelf() {
        return this;
    }
}
