package test2_1201_1213;

import java.util.ArrayList;

class EnglishQuiz extends Quiz {
    //생성자
    public EnglishQuiz(ArrayList<String[]> words, ArrayList<String[]> wrongWords) {
        super(words, wrongWords);
    }

    //한국어 뜻을 출력하고 영어 단어 입력 요청
    @Override
    public void showQuestion(String[] word) {
        System.out.print("뜻: " + word[1] + " → 영어 단어를 입력하세요: ");
    }

    //해당 단어의 영어 정답 반환
    @Override
    public String getCorrectAnswer(String[] word) {
        return word[0];
    }
}
