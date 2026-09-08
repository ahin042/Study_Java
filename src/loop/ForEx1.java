package loop;

public class ForEx1 {
    public static void main(String[] args) {
        int c = 0;

        for (int i = 1; i <= 10; i++) {
            c += i;
        }

        System.out.println("1부터 10까지의 합은 " + c + "입니다.");
    }
}
