import java.util.ArrayList;
import java.util.Scanner;

// 단어 시험의 공통 기능을 정의하는 부모 클래스
class Quiz {
    private ArrayList<String[]> words;
    private ArrayList<String[]> wrongWords;
    private static int quizCount = 0;

    public Quiz(ArrayList<String[]> words, ArrayList<String[]> wrongWords) {
        this.words = words;
        this.wrongWords = wrongWords;
    }

    // 등록된 모든 단어로 시험 진행
    public void startQuiz(Scanner sc) {
        if (words.isEmpty()) {
            System.out.println("등록된 단어가 없습니다.");
            return;
        }
        System.out.println("\n===== 시험 시작 =====");
        // 이번 시험에서 틀린 단어는 오답 목록에 (중복 없이) 추가
        ArrayList<String[]> wrongNow = run(new ArrayList<>(words), sc);
        for (String[] w : wrongNow) {
            if (!wrongWords.contains(w)) {
                wrongWords.add(w);
            }
        }
    }

    // 오답 목록의 단어만 다시 출제
    public void reviewWrongWords(Scanner sc) {
        if (wrongWords.isEmpty()) {
            System.out.println("오답 목록이 비어 있습니다.");
            return;
        }
        System.out.println("\n===== 오답 복습 시작 =====");
        ArrayList<String[]> wrongNow = run(new ArrayList<>(wrongWords), sc);
        // 이번에 맞힌 단어는 오답 목록에서 제거
        wrongWords.retainAll(wrongNow);
    }

    // 문제 목록을 출제하고 채점한 뒤, 틀린 단어 목록을 반환
    private ArrayList<String[]> run(ArrayList<String[]> questions, Scanner sc) {
        ArrayList<String[]> wrongNow = new ArrayList<>();
        int correct = 0;
        for (int i = 0; i < questions.size(); i++) {
            String[] word = questions.get(i);
            System.out.print((i + 1) + "번 ");
            showQuestion(word);
            String input = sc.nextLine();
            if (checkAnswer(word, input)) {
                System.out.println("정답!");
                correct++;
            } else {
                System.out.println("오답! 정답: " + getCorrectAnswer(word));
                wrongNow.add(word);
            }
        }
        quizCount++;
        showResult(correct, questions.size());
        return wrongNow;
    }

    // 문제 출력 (자식 클래스에서 오버라이딩)
    public void showQuestion(String[] word) {
        System.out.print(word[0] + " → ");
    }

    // 정답 반환 (자식 클래스에서 오버라이딩)
    public String getCorrectAnswer(String[] word) {
        return word[1];
    }

    public boolean checkAnswer(String[] word, String input) {
        return getCorrectAnswer(word).equalsIgnoreCase(input.trim());
    }

    public void showResult(int correct, int total) {
        double rate = total == 0 ? 0 : (double) correct / total * 100;
        System.out.println("\n----- 결과 -----");
        System.out.println("정답: " + correct + "개");
        System.out.println("오답: " + (total - correct) + "개");
        System.out.printf("정답률: %.1f%%\n", rate);
        System.out.println("전체 시험 진행 횟수: " + quizCount + "회");
    }
}

// 한국어 뜻을 보고 영어 단어를 입력하는 시험
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

// 영어 단어를 보고 한국어 뜻을 입력하는 시험
class MeaningQuiz extends Quiz {
    public MeaningQuiz(ArrayList<String[]> words, ArrayList<String[]> wrongWords) {
        super(words, wrongWords);
    }

    @Override
    public void showQuestion(String[] word) {
        System.out.print("단어: " + word[0] + " → 한국어 뜻을 입력하세요: ");
    }

    @Override
    public String getCorrectAnswer(String[] word) {
        return word[1];
    }
}

public class TestFile {
    private static ArrayList<String[]> wordList = new ArrayList<>();
    private static ArrayList<String[]> wrongList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String menu;
        do {
            showMenu();
            menu = scanner.nextLine().trim();
            switch (menu) {
                case "1" -> registerWords();
                case "2" -> startQuiz();
                case "3" -> startReview();
                case "4" -> System.out.println("프로그램을 종료합니다.");
                default -> System.out.println("올바른 메뉴 번호를 입력하세요.");
            }
        } while (!menu.equals("4"));
    }

    private static void showMenu() {
        System.out.print("\n===== EduBridge =====\n1. 단어 등록\n2. 단어 테스트\n3. 오답 복습\n4. 종료\n메뉴를 선택하세요: ");
    }

    private static void registerWords() {
        int n = 0;
        System.out.print("등록할 단어 개수: ");
        String input = scanner.nextLine().trim();
        if (input.isEmpty() || input.length() > 4) {
            System.out.println("1~4자리 숫자를 입력하세요.");
            return;
        }
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c < '0' || c > '9') {
                System.out.println("숫자를 입력하세요.");
                return;
            }
            n = n * 10 + (c - '0');   // 한 글자씩 숫자로 바꿔 이어 붙이기
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(i + "번째 영어 단어: ");
            String english = scanner.nextLine().trim();
            System.out.print(i + "번째 한국어 뜻: ");
            String meaning = scanner.nextLine().trim();
            wordList.add(new String[]{english, meaning});
        }
        System.out.println(n + "개의 단어가 등록되었습니다.");
    }

    private static void startQuiz() {
        if (wordList.isEmpty()) {
            System.out.println("먼저 단어를 등록하세요.");
            return;
        }
        Quiz quiz = selectQuiz();
        if (quiz != null) quiz.startQuiz(scanner);
    }

    private static void startReview() {
        if (wrongList.isEmpty()) {
            System.out.println("오답 목록이 비어 있습니다.");
            return;
        }
        Quiz quiz = selectQuiz();
        if (quiz != null) quiz.reviewWrongWords(scanner);
    }

    // 시험 유형을 선택해 Quiz 객체 생성 (다형성)
    private static Quiz selectQuiz() {
        System.out.print("1. 뜻 보고 영어 단어 맞히기\n2. 영어 단어 보고 뜻 맞히기\n시험 유형을 선택하세요: ");
        String type = scanner.nextLine().trim();
        if (type.equals("1")) return new EnglishQuiz(wordList, wrongList);
        if (type.equals("2")) return new MeaningQuiz(wordList, wrongList);
        System.out.println("올바른 번호를 입력하세요.");
        return null;
    }
}





