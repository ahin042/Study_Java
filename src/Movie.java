import java.util.Scanner;

class BankAccount {
    private String id;
    private String name;
    private int money;

    public BankAccount(String id, String name, int money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }

    public void deposit(int money) {
        this.money += money;
    }

    public int withdraw() {
        return this.money;
    }

    public void transfer(int money) {
        if (this.money >= money) {
            this.money -= money;
        } else {
            System.out.println("잔액이 부족합니다.");
        }

    }

    public String showInfo() {
        return name + "의 계좌번호: " + id + " 잔액: " + money;
    }

}

public class Movie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount accountLee = new BankAccount("101-1234-5678", "이순신", 100000);
        BankAccount accountKim = new BankAccount("101-5678-1234", "김용식", 200000);
        BankAccount accountAhn = new BankAccount("101-7485-9632", "안중근", 300000);

        System.out.println("이체할 대상과 금액을 입력하세요.(김용식: 1, 안중근: 2)");
        int num = sc.nextInt();
        int money = sc.nextInt();


    }
}