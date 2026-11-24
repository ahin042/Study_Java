package test2_1201_1213;

import java.util.ArrayList;
import java.util.Scanner;

class Quiz {
    private ArrayList<String[]> words;
    private ArrayList<String[]> wrongWords;
    private static int quizCount = 0;

    public Quiz(ArrayList<String[]> words, ArrayList<String[]> wrongWords) {
        this.words = words;
        this.wrongWords = wrongWords;
    }

    public void startQuiz(Scanner scanner) {
        if (words.isEmpty()) {
            System.out.println("등록된 단어가 없습니다.");
            return;
        }
        System.out.println("\n===== 시험 시작 =====");

        ArrayList<String[]> wrongNow = run(new ArrayList<>(words), scanner);
        for (String[] w : wrongNow) {
            if (!wrongWords.contains(w)) {
                wrongWords.add(w);
            }
        }
    }

    public void reviewWrongWords(Scanner scanner) {
        if (wrongWords.isEmpty()) {
            System.out.println("오답 목록이 비어 있습니다.");
            return;
        }
        System.out.println("\n===== 오답 복습 시작 =====");
        ArrayList<String[]> wrongNow = run(new ArrayList<>(wrongWords), scanner);

        wrongWords.retainAll(wrongNow);
    }

    private ArrayList<String[]> run(ArrayList<String[]> questions, Scanner scanner) {
        ArrayList<String[]> wrongNow = new ArrayList<>();
        int correct = 0;

        for (int i = 0; i < questions.size(); i++) {
            String[] word = questions.get(i);
            System.out.print((i + 1) + "번 ");
            showQuestion(word);
            String input = scanner.nextLine();

            if (checkAnswer(word, input)) {
                System.out.println("정답");
                correct++;
            } else {
                System.out.println("오답 \n정답: " + getCorrectAnswer(word));
                wrongNow.add(word);
            }
        }

        quizCount++;
        showResult(correct, questions.size());
        return wrongNow;
    }

    public void showQuestion(String[] word) {
        System.out.print(word[0] + " → ");
    }

    public String getCorrectAnswer(String[] word) {
        return word[1];
    }

    public boolean checkAnswer(String[] word, String input) {
        return getCorrectAnswer(word).equalsIgnoreCase(input.trim());
    }

    public void showResult(int correct, int total) {
        double rate = total == 0 ? 0 : (double) correct / total * 100;

        System.out.println("\n----- 결과 -----");
        System.out.println("정답: " + correct + "개");
        System.out.println("오답: " + (total - correct) + "개");
        System.out.printf("정답률: %.1f%%\n", rate);
        System.out.println("전체 시험 진행 횟수: " + quizCount + "회");
    }
}
class EnglishQuiz extends Quiz {
    public EnglishQuiz(ArrayList<String[]> words, ArrayList<String[]> wrongWords) {
        super(words, wrongWords);
    }

    @Override
    public void showQuestion(String[] word) {
        System.out.print("뜻: " + word[1] + " → 영어 단어를 입력하세요: ");
    }

    @Override
    public String getCorrectAnswer(String[] word) {
        return word[0];
    }
}

class MeaningQuiz extends Quiz {
    public MeaningQuiz(ArrayList<String[]> words, ArrayList<String[]> wrongWords) {
        super(words, wrongWords);
    }

    @Override
    public void showQuestion(String[] word) {
        System.out.print("뜻: " + word[0] + " → 한국어 뜻을 입력하세요: ");
    }

    @Override
    public String getCorrectAnswer(String[] word) {
        return word[1];
    }
}


public class Main {
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

    private static String showMenu() { // void -> String으로 변경
        return "\n===== EduBridge =====\n1. 단어 등록\n2. 단어 테스트\n3. 오답 복습\n4. 종료\n메뉴를 선택하세요: ";
    }

    private static String ask(String msg) {
        System.out.println(msg) ;
        return scanner.nextLine();
    }

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

        String t = ask("1. 뜻을 보고 영어 단어 맞히 \n2. 영어 단어 보고 뜻 맞히기\n시험 유형을 선택하세요: ");
        Quiz q = t.equals("1") ? new EnglishQuiz(words, wrongs) : t.equals("2") ? new MeaningQuiz(words, wrongs) : null;

        if (q == null) {
            System.out.println("올바른 번호를 입력하세요.");
        }

        else if (test) q.startQuiz(scanner);
        else q.reviewWrongWords(scanner);
    }
}
