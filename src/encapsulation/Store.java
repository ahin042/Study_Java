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
            // 할인
            // 데이터를 저장하고 새로운 폰으로 이동
            return phone;
        } else {
            return null;
        }
    }
}
