package cooperation;

public class Bus {
    private int busNumber;  // 버스 번호
    private int passengerCount; // 승객 수
    private int money; // 버스 수입

    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    public void take() {
        money += 1000;
        passengerCount++;
    }

    public void showInfo() {
        System.out.println(busNumber + "번 버스의 승객은 "
                + passengerCount + "명이고, 현재 수입은 "
                + money + "원 입니다.");
    }
}
