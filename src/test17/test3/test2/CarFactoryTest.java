package test17.test3.test2;

public class CarFactoryTest {
    public static void main(String[] args){
        CarFactory factory = CarFactory.getInstance();
        Car teslarw = factory.createCar();
        Car teslarb = factory.createCar();

        System.out.println(teslarw.getCarNum());
        System.out.println(teslarb.getCarNum());
    }
}
