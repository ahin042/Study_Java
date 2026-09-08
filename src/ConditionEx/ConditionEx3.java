package ConditionEx;

public class ConditionEx3 {
    public static void main(String[] args) {
        double distance = 8.5;
        String r;
        if (distance <= 1) {
            r = "도보";
        } else if (distance <= 10) {
            r = "자전거";
        } else if (distance <= 50) {
            r = "버스";
        } else {
            r = "기차";
        }
        System.out.println("추천 이동 수단: " + r);
    }
}
