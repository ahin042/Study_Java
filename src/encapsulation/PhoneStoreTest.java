package encapsulation;

public class PhoneStoreTest {
    public static void main(String[] args) {
        Phone phone = new Phone("아이폰", 1000000);
        Store store = new Store(phone);

        Customor customor = new Customor("홍길동",1100000,"아이폰");
        customor.buyPhone(store);
    }
}
