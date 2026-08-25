package Chapter2.Conversion;

public class Conversion2 {
    public static void main(String[] args) {
        byte bNum = 10;
        int iNum = bNum;

        System.out.println(bNum);
        System.out.println(iNum);

        int iNum2 = 20;
        float fNum = iNum2;

        System.out.println(iNum);
        System.out.println(fNum);

        double dnum;
        dnum = fNum + iNum;

        System.out.println(fNum + iNum);
        System.out.println(dnum);
    }
}
