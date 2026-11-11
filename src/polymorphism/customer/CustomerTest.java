package polymorphism.customer;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer(10010, "이순신");
        System.out.println(customerLee.showCustomerInfo());

        Customer customerAhn = new VIPCustomer(20010, "안중근", 1011);
        System.out.println(customerAhn.showCustomerInfo());

        System.out.println("===할인율과 포인트 계산===");
        int price = 400000;
        int leeprice = customerLee.calcPrice(price);
        int ahnprice = customerAhn.calcPrice(price);

        System.out.println(customerLee.customerName + "님이 " + leeprice + "원 지불하셨습니다..");
        System.out.println(customerLee.showCustomerInfo());

        System.out.println(customerAhn.customerName + "님이 " + ahnprice + "원 지불하셨습니다.");
        System.out.println(customerAhn.showCustomerInfo());
    }
}
