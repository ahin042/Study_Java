package goormtest;

import java.util.ArrayList;
import java.util.Scanner;

class Car {
    private int num;
    private String carNumber;
    private String carType;
    private int dailyPrice;
    private boolean rented;
    private static int serialNum = 101;

    public Car(String carNumber, String carType, int dailyPrice) {
        this.carNumber = carNumber;
        this.carType = carType;
        this.dailyPrice = dailyPrice;
        this.num = serialNum++;
    }

    public void rent() {

    }


}

public class Main4 {
    public static void main(String[] args) {
        Scanner scanenr = new Scanner(System.in);
        ArrayList<Car> list = new ArrayList<>();
        list.add(new Car("234하5678", "teslar", 100000));
        list.add(new Car("555허2158", "sonata", 70000));
        list.add(new Car("123호4567", "genesis", 90000));
    }
}