package encapsulation;

public class Customor {
    private String name;
    private double money;
    private String model;

    public Customor(String name, double money, String model)  {
        this.name = name;
        this.money = money;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void buyPhone(Store store) {
        Phone phone = store.sellPhone(model,money);

        if (phone == null) {
            System.out.println("고객: 핸드폰을 구매하지 못했습니다.");
        } else {
            System.out.println("고객: 핸드폰을 구매했습니다. ");
        }
    }
}
