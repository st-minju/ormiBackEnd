package com.barabam.springstudy;

import java.util.Calendar;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
  public static void main(String[] args) {
    Quiz quiz = new Quiz();
    quiz.setQuestion("오늘의 날짜는?");
    quiz.setAnswer(
        Calendar.getInstance().get(Calendar.YEAR)
            + "-"
            + (Calendar.getInstance().get(Calendar.MONTH) + 1)
            + "-"
            + Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
    QuizView view = new QuizView();

    QuizController quizController = new QuizController(quiz, view);
    quizController.StartQuiz();
  }
}
