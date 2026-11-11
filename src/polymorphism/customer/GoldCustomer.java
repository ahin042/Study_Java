package polymorphism.customer;

public class GoldCustomer extends Customer {
    private int agentID; //담당 상담원 아이디
    double saleRatio; //할인율

    public GoldCustomer(){
        super(); // 있어도 되고 없어도 됨.
        initVIPCustomer();
    }

    public GoldCustomer(int customerId, String customerName){
        super(customerId, customerName);
        initVIPCustomer();
    }

    private void initVIPCustomer(){
        saleRatio = 0.1; //할인율
        bonusRatio = 0.05; // 보너스 적립률
        customerGrade = "GOLD";
    }

    @Override
    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        return price - (int)(price * saleRatio);
    }

    public String showCustomerInfo(){
        return super.showCustomerInfo() + "담당 상담원 아이디는 " + agentID;
    }
}
