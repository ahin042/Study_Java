package polymorphism.customer;

import java.util.ArrayList;

public class CustomerTest2 {
    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<Customer>();
        customerList.add(new Customer(10010, "홍길동"));
        customerList.add(new Customer(10011, "김철수"));
        customerList.add(new VIPCustomer(10012, "박영희",1201));
        customerList.add(new GoldCustomer(10013, "김민수"));
        customerList.add(new GoldCustomer(10014, "이영희"));

        System.out.println("===고객 정보 출력===");
        for(Customer customer : customerList){
            System.out.println(customer.showCustomerInfo());
        }

        System.out.println("===할인율과 포인트 계산===");
        for(Customer customer : customerList){
            int price = 400000;
            int discountedPrice = customer.calcPrice(price);
            System.out.println(customer.customerName + "님이 " + discountedPrice + "원 지불하셨습니다.");
        }
    }
}
