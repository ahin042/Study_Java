package inheritance;

public class VIPCustomer extends Customer {
    private int agentID; // 담당 상담원 아이디
    double saleRatio; // 할인율


    public VIPCustomer() {
        saleRatio = 0.1;
        bounusRatio = 0.05;
        System.out.println("하위 클래스 VIPCustomer() 생성자 호출");
    }
}
