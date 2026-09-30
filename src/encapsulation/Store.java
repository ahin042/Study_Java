package encapsulation;

public class Store {
    private Phone phone;

    public Store(Phone phone) {
        this.phone = phone;
    }

    // 폰 판매가 가능하면 판매할 폰을 반환, 불가능하면 null 반환
    public Phone sellPhone(String model, double budget) {
        if (model.equals(phone.getModel()) && budget >= phone.getPrice()) {
            // 요금제 등록
            registerPayment();
            // 할인
            discountPromotion();
            // 데이터를 저장하고 새로운 폰으로 이동
            saveDate();
            return phone;
        } else {
            return null;
        }
    }

    private void registerPayment() {
        System.out.println("대리점: 요금제를 등록합니다. 약정을 등록합니다");
    }

    private void discountPromotion() {
        System.out.println("대리점: 프로모션으로 할인합니다.");
    }

    private void saveDate() {
        System.out.println("대리점: 데이터를 저장하고 새로운 폰으로 이동합니다.");
    }
}
