package inheritance;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerKang = new Customer();
        customerKang.custmerId = 10010;
        customerKang.custmerName = "강민준";
        customerKang.bonusPoint = 100;
        System.out.println(customerKang.showCustmerInfo());
        int price = customerKang.calcPrice(40000);
        System.out.println(customerKang.custmerName + "님이 지불금액은 " + price + "원입니다.");

        VIPCustomer customerChoi = new VIPCustomer();
        customerChoi.custmerId = 10011;
        customerChoi.custmerName = "최민기";
        customerChoi.bonusPoint = 20000;
        System.out.println(customerChoi.showCustmerInfo());
        price = customerChoi.calcPrice(40000);
        System.out.println(customerChoi.custmerName + "님이 지불금액은 " + price + "원입니다.");

        VIPCustomer customerKim = new VIPCustomer(10012, "김민수", 1101);
        customerKim.bonusPoint = 220000;
        System.out.println(customerKim.showVIPInfo());
    }
}
