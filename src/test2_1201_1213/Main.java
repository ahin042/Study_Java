package test2_1201_1213;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //변수
    private static ArrayList<String[]> words = new ArrayList<>();
    private static ArrayList<String[]> wrongs = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String menu;

        do {
            menu = ask(showMenu());
            switch (menu) {
                case "1" -> registerWords();
                case "2" -> runQuiz(true);
                case "3" -> startReview();
                case "4" -> System.out.println("프로그램을 종료합니다.");
                default -> System.out.println("올바른 메뉴 번호를 입력하세요.");
            }
        } while (!menu.equals("4"));
    }

    //프로그램 메뉴 출력
    private static String showMenu() { // void -> String으로 변경
        return "\n===== EduBridge =====\n1. 단어 등록\n2. 단어 테스트\n3. 오답 복습\n4. 종료\n메뉴를 선택하세요: ";
    }

    private static String ask(String msg) {
        System.out.println(msg) ;
        return scanner.nextLine();
    }

    //등록할 단어 개수를 입력받고 해당 개수만큼 단어 등록
    private static void registerWords() {
        String input = ask("등록할 단어 개수: ");

        if (input.isEmpty() || input.length() > 4) {
            System.out.println("1~4자리 숫자를 입력하세요.");
            return;
        }

        int n = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c < '0' || c > '9') {
                System.out.println("숫자를 입력하세요.");
                return;
            }
            n = n * 10 + (c - '0');
        }

        for (int i = 1; i <= n; i++)
            words.add(new String[]{ask(i + "번째 영어 단어: "), ask(i + "번째 한국어 뜻: ")});
        System.out.println(n + "개의 단어가 등록되었습니다.");
    }

    //오답 목록에 있는 단어로 복습 시험 실행
    private static void startReview() {
        if (wrongs.isEmpty()) {
            System.out.println("오답 목록이 비어있습니다.");
            return;
        }

        String t = ask("1. 뜻을 보고 영어 단어 맞히기\n2. 영어 단어 보고 뜻 맞히기\n복습 시험 유형을 선택하세요: ");
        Quiz q = t.equals("1") ? new EnglishQuiz(words, wrongs) : t.equals("2") ? new MeaningQuiz(words, wrongs) : null;

        if (q == null) {
            System.out.println("올바른 번호를 입력하세요.");
            return;
        }

        q.reviewWrongWords(scanner);
    }

    private static void runQuiz(boolean test) {
        if ((test? words : wrongs).isEmpty()) {
            System.out.println(test? "먼저 영어 단어를 등록하세요." : "오답 목록이 비어있습니다.");
            return;
        }

        String t = ask("1. 뜻을 보고 영어 단어 맞히기 \n2. 영어 단어 보고 뜻 맞히기\n시험 유형을 선택하세요: ");
        Quiz q = t.equals("1") ? new EnglishQuiz(words, wrongs) : t.equals("2") ? new MeaningQuiz(words, wrongs) : null;

        if (q == null) {
            System.out.println("올바른 번호를 입력하세요.");
        }

        else if (test) q.startQuiz(scanner);
        else q.reviewWrongWords(scanner);
    }
}