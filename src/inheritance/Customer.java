package inheritance;

public class Customer {
    protected int custmerId;
    protected String custmerName;
    protected String custmerGrade;
    protected int bonusPoint;
    protected double bounusRatio; // 보너스 포인트 적립 비율

    public Customer() {
        custmerGrade = "SILVER";
        bounusRatio = 0.01;
        System.out.println("상위 클래스 Customer() 생성자 호출");
    }

    public Customer(int custmerId, String custmerName) {
        this.custmerId = custmerId;
        this.custmerName = custmerName;
        custmerGrade = "SILVER";
        bounusRatio = 0.01;
        System.out.println("상위 클래스 Customer(int, String) 생성자 호출");
    }

    public int calcPrice(int price) {
        bonusPoint += price * bounusRatio;
        return price;
    }

    public String showCustmerInfo() {
        return custmerName + "님의 등급은 " + custmerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
    }
}
