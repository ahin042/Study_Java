package test2_1201_1213;

import java.util.ArrayList;

class MeaningQuiz extends Quiz {
    //생성자
    public MeaningQuiz(ArrayList<String[]> words, ArrayList<String[]> wrongWords) {
        super(words, wrongWords);
    }

    //영어 단어를 출력하고 한국어 뜻 입력 요청
    @Override
    public void showQuestion(String[] word) {
        System.out.print("단어: " + word[0] + " → 한국어 뜻을 입력하세요: ");
    }

    //해당 단어의 한국어 정답 반환
    @Override
    public String getCorrectAnswer(String[] word) {
        return word[1];
    }
}