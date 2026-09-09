package ArrayEx;

public class ArrayEx3 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int num = 0;

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                arr[num] = i;
                num++;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
