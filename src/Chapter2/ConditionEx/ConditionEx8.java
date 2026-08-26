package Chapter2.ConditionEx;

public class ConditionEx8 {
    public static void main(String[] args) {
        int menu = 3;
        String result = switch (menu) {
            case 1 -> "아메리카노";
            case 2 -> "카페라떼";
            case 3 -> "초코라떼";
            case 4 -> "녹차";
            default -> {
                System.out.println("없는 메뉴입니다");
                yield "";
            }
        };
        System.out.println("선택한 메뉴: " + result);
    }
}
