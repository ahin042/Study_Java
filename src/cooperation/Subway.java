package cooperation;

public class Subway {
    private int lineNumber; // 노선 번호
    private int passengerCount; // 승객 수
    private int money; // 지하철 수입

    public Subway(int lineNumber, int passengerCount, int money) {
        this.lineNumber = lineNumber;
        this.passengerCount = passengerCount;
        this.money = money;
    }

    public Subway(int lineNumber) {
        this.lineNumber = lineNumber;
    }
}
