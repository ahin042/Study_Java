package Chapter2.OperationAssignment;

public class OperationAssignment5 {
    public static void main(String[] args) {
        int x = 17;
        String r;
        if (x % 2 == 1) {
            r = "홀수";
        } else {
            r  = "짝수";
        }
        System.out.println("결과 " + x + "은 " + r + "입니다");
    }
}