package Chapter2;

public class Operation5 {
    public static void main(String[] args) {
        int num = 0B0000101; //2진수 표기

        System.out.println(num << 2);
        System.out.println(num >> 2);
        System.out.println(num >>> 2);

        num <<= 2;
        System.out.println(num);

        int num2 = 0B0000101;
        System.out.println(num2 << 2);
        System.out.println(num2 >> 2);
        System.out.println(num2 >>> 2);
    }
}
