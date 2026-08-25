package Chapter2.Conversion;

public class Conversion4 {
    public static void main(String[] args) {
        int iNum = 1000;
        byte bNum = (byte) iNum;
        System.out.println(bNum);

        double dNum1 = 1.2;
        float fNum2 = 0.9f;

        int iNum3 = (int) dNum1 + (int) fNum2;
        System.out.println(iNum3);

    }
}
