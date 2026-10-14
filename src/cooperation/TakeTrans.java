package cooperation;

public class TakeTrans {

    public static void main(String[] args) {

        Student studentKwon = new Student("권아인", 5000);
        Student studentLee = new Student("이수연", 20000);
        Bus busA = new Bus(100);
        Subway subway2 = new Subway("2");

        studentKwon.getBus(busA);

        studentKwon.showInfo();
        busA.showInfo();

        studentLee.showInfo();
        subway2.showInfo();
    }
}
