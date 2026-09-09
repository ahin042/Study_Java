package ArrayEx;

public class ArrayEx4 {
    public static void main(String[] args) {
        int[] arr = new int[]{89, 76, 100, 68, 48, 98, 56, 77, 95};
        int num = 0;

        for (int i : arr) {
            num += i;
        }
        System.out.println("평균의 합: " + num);
        System.out.printf("점수의 평균: %.1f",(double) num/arr.length);
    }
}
