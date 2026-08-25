package Chapter2.OperationAssignment;

public class OperationAssignment1 {
    public static void main(String[] args) {
        double val1 = 2.5;
        double val2 = 3.5;
        double val3 = 6.5;
        double sum = val1 + val2 + val3;
        double avg = sum / 3;
        System.out.printf("합계: %.1f\n평균: %.1f", sum, avg);
    }
}