package inheritance;

public class VIPCustomer extends Customer {
    private int agentID; // 담당 상담원 아이디
    double saleRatio; // 할인율


    public VIPCustomer() {
       // super();
        saleRatio = 0.1;
        bounusRatio = 0.05;
        custmerGrade = "VIP";
        System.out.println("하위 클래스 VIPCustomer() 생성자 호출");
    }

    public VIPCustomer(int custmerId, String custmerName, int agentID) {
       // super(custmerId, custmerName);
        this.agentID = agentID;
        custmerGrade = "VIP";
        saleRatio = 0.1;
        bounusRatio = 0.05;
        System.out.println("하위 클래스 VIPCustomer(int, String, int) 생성자 호출");
    }

    public String showVIPInfo() {
        return super.showCustmerInfo() + " 담당 상담원 아이디는 " + agentID + "입니다.";
    }
}
