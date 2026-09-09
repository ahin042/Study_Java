package ArrayEx;

public class ArrayEx6 {
    public static void main(String[] args) {
        int[][] score = new int[][]{
                {89, 76, 100, 68, 48, 98, 56, 77, 95},
                {50, 60, 70, 100, 99, 88, 83, 78, 93}
        };

        int total = 0;
        int Count = 0;

        for (int i = 0; i < score.length; i++) {
            int sum = 0;

            for (int j = 0; j < score[i].length; j++) {
                sum += score[i][j];
            }

            double r = (double) sum / score[i].length;
            String name = (i == 0) ? "A반" : "B반";
            System.out.printf("%s 평균: %.1f%n", name, r);

            total += sum;
            Count += score[i].length;
        }
    }
}