package inheritance;

public class Custmer {
    private int custmerId;
    private String custmerName;
    private String custmerGrade;
    private int bonusPoint;
    private double bounusRatio; // 보너스 포인트 적립 비율

    public Custmer(int custmerId, String custmerName) {
        this.custmerId = custmerId;
        this.custmerName = custmerName;
        this.custmerGrade = "SILVER";
        this.bounusRatio = 0.01;
    }

    public int calcPrice(int price) {
        bonusPoint += price * bounusRatio;
        return price;
    }

    public String showCustmerInfo() {
        return custmerName + "님의 등급은 " + custmerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
    }
}
