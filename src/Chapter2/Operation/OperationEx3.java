package Chapter2.Operation;

public class OperationEx3 {
    public static void main(String[] args) {
        int num1 = 10;
        int i = 2;

        boolean value = ((num1 = num1 + 10)<10) && ((i = i + 10)<10);
        System.out.println(value);
    }
}
