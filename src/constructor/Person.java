package constructor;

public class Person {
    String name;
    int height;
    int weight;

    public Person(){}

    public Person(String pname) {
        name = pname;
    }

    public Person(String pname, int pheight, int pweight) {
        name = pname;
        height = pheight;
        weight = pweight;
    }
}
