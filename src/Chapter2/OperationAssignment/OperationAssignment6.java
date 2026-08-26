package Chapter2.OperationAssignment;

public class OperationAssignment6 {
    public static void main(String[] args) {
        int kor = 85;
        int eng = 90;
        int math = 78;
        int total = kor + eng + math;
        double avg = (double) total / 3;
        boolean pass = (avg >= 80);
        System.out.println("합계: " + total);
        System.out.printf("평균 %.1f",avg);
        System.out.println();
        System.out.println(pass?"결과: 통과":"결과: 미통과");
    }
}
