package Chapter2;

public class Operation3 {
    public static void main(String[] args) {
        int num1 = 10;
        int i = 2;

        boolean value = ((num1 = num1 + 10)<10) && ((i = i + 10)<10);
        System.out.println(value);
    }
}
