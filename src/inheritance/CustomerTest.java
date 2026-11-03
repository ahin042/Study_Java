package inheritance;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerKang = new Customer();
        customerKang.custmerId = 10010;
        customerKang.custmerName = "강민준";
        customerKang.bonusPoint = 100;
        System.out.println(customerKang.showCustmerInfo());

        VIPCustomer customerChoi = new VIPCustomer();
        customerChoi.custmerId = 10011;
        customerChoi.custmerName = "최민기";
        customerChoi.bonusPoint = 20000;
        System.out.println(customerChoi.showCustmerInfo());

    }
}
