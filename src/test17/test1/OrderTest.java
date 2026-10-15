package test17.test1;

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order(202609013, "dgsw", "2026년 9월 1일", "홍길동", "PD0345-12", "대구광역시 달성군 구지면 창리로 93");
        order.showInfo();
    }
}