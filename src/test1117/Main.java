package test1117;

import java.util.Scanner;

class Food {
    private String name;
    private double servedGrams;
    private double wasteGrams;
    private static int foodCount;

    public Food(String name, double servedGrams, double wasteGrams) {
        this.name = name;
        this.servedGrams = servedGrams;
        this.wasteGrams = wasteGrams;
        foodCount++;
    }

    public String getName() {
        return name;
    }

    public double getServedGrams() {
        return servedGrams;
    }

    public double getWasteGrams() {
        return wasteGrams;
    }

    public double getWasteRate() {
        if (servedGrams == 0) {
            return 0;
        }
        return (wasteGrams / servedGrams) * 100;
    }

    public String getAdvice() {
        return "적정량을 배식하고 잔반을 줄이세요.";
    }

    public static int getFoodCount() {
        return foodCount;
    }
}

class RiceFood extends Food {
    public RiceFood(String name, double servedGrams, double wasteGrams) {
        super(name, servedGrams, wasteGrams);
    }

    @Override
    public String getAdvice() {
        return "밥은 개인의 식사량에 맞게 배식량을 조절하세요.";
    }
}

class SideDish extends Food {
    public SideDish(String name, double servedGrams, double wasteGrams) {
        super(name, servedGrams, wasteGrams);
    }

    @Override
    public String getAdvice() {
        return "반찬은 소량씩 배식하고 부족하면 추가로 배식하세요.";
    }
}

class WasteManager {
    private java.util.ArrayList<Food> foods;
    public static final double TARGET_RATE = 20.0;

    public WasteManager() {
        foods = new java.util.ArrayList<>();
    }

    public void addFood(Food food) {
        foods.add(food);
    }

    public void printReport() {
        if (foods.isEmpty()) {
            System.out.println("등록된 음식이 없습니다.");
            return;
        }

        double totalServed = 0;
        double totalWaste = 0;

        for (Food food : foods) {
            System.out.println("음식명: " + food.getName());
            System.out.println("배식량(g): " + food.getServedGrams());
            System.out.println("잔반량(g): " + food.getWasteGrams());
            System.out.printf("잔반율(%%): %.2f%%\n", food.getWasteRate());
            System.out.println("개선 안내: " + food.getAdvice());
            System.out.println();

            totalServed += food.getServedGrams();
            totalWaste += food.getWasteGrams();
        }

        double overallWasteRate = (totalServed == 0) ? 0 : (totalWaste / totalServed) * 100;
        System.out.printf("전체 배식량(g): %.2f\n", totalServed);
        System.out.printf("전체 잔반량(g): %.2f\n", totalWaste);
        System.out.printf("전체 잔반율(%%): %.2f%%\n", overallWasteRate);

        if (overallWasteRate <= TARGET_RATE) {
            System.out.println("목표 잔반율을 달성했습니다.");
        } else {
            System.out.println("잔반을 줄이기 위한 개선이 필요합니다.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WasteManager wasteManager = new WasteManager();
        System.out.print("등록할 음식 수를 입력하세요: ");
        int foodCount = scanner.nextInt();

        for (int i = 0; i < foodCount; i++) {
            System.out.println((i + 1) + "번째 음식 정보를 입력하세요.");
            System.out.print("음식 종류 (1: 밥류, 2: 반찬류): ");
            int foodType = scanner.nextInt();
            System.out.print("음식명: ");
            String name = scanner.nextLine();
            System.out.print("배식량(g): ");
            double servedGrams = scanner.nextDouble();
            System.out.print("잔반량(g): ");
            double wasteGrams = scanner.nextDouble();

            Food food;
            if (foodType == 1) {
                food = new RiceFood(name, servedGrams, wasteGrams);
            } else {
                food = new SideDish(name, servedGrams, wasteGrams);
            }
            wasteManager.addFood(food);
        }

        System.out.println("생성된 음식 객체 수: " + Food.getFoodCount());
        wasteManager.printReport();

    }
}