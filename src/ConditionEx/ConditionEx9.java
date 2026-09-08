package ConditionEx;

public class ConditionEx9 {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 5;
        char op = '/';

        int result = switch (op) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다");
                    yield 0;
                } else {
                    yield num1 / num2;
                }
            }
            default -> {
                System.out.println("잘못된 연산자입니다.");
                yield 0;
            }
        };
        if (op == '/' && num2 == 0) {
        } else {
            System.out.println(num1 + " " + op + " " + num2 + " = " + result);
        }
    }
}