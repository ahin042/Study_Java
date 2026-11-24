package test2_1201_1213;

import java.util.ArrayList;
import java.util.Scanner;

class Quiz {
    //변수
    private ArrayList<String[]> words;
    private ArrayList<String[]> wrongWords;
    private static int quizCount = 0;

    //생성자
    public Quiz(ArrayList<String[]> words, ArrayList<String[]> wrongWords) {
        this.words = words;
        this.wrongWords = wrongWords;
    }

    //퀴즈 시작 : 등록된 단어로 시험 진행 및 채점
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

    //오답 복습 : 틀린 단어만 다시 출제
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

    //문제 출력
    public void showQuestion(String[] word) {
        System.out.print(word[0] + " → ");
    }

    //문제의 정답 반환
    public String getCorrectAnswer(String[] word) {
        return word[1];
    }

    //사용자 입력과 정답을 비교하여 결과 반환
    public boolean checkAnswer(String[] word, String input) {
        return getCorrectAnswer(word).equalsIgnoreCase(input.trim());
    }

    //정답 개수, 오답 개수, 정답률 및 전체 시험 진행 횟수 출력
    public void showResult(int correct, int total) {
        double rate = total == 0 ? 0 : (double) correct / total * 100;

        System.out.println("\n----- 결과 -----");
        System.out.println("정답: " + correct + "개");
        System.out.println("오답: " + (total - correct) + "개");
        System.out.printf("정답률: %.1f%%\n", rate);
        System.out.println("전체 시험 진행 횟수: " + quizCount + "회");
    }
}