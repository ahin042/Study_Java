package polymorphism.animal;

public class AnimalTest {
    public static void main(String[] args) {
//        AnimalTest atest = new AnimalTest();
//        atest.moveAnimal(new Human());
//        atest.moveAnimal(new Tiger());
//        atest.moveAnimal(new Eagle());

        Animal ani = new Tiger();
        if (ani instanceof Human h) {
            h.move();
        } else if (ani instanceof Tiger t) {
            t.move();
        } else if (ani instanceof Eagle e) {
            e.move();
        } else {
            System.out.println("지원되지 않는 동물입니다.");

        }


    }

    public void moveAnimal(Animal animal) {
        animal.move();
    }
}
