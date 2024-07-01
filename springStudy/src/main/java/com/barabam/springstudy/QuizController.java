package com.barabam.springstudy;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class QuizController {

  private Quiz quiz;
  private QuizView view;

  public void StartQuiz() {
    view.displayQuestion(quiz.getQuestion());
    String answer = view.getUserAnswer();
    view.displayResult(answer.equals(quiz.getAnswer()));
    System.out.println("정답은 " + quiz.getAnswer() + " 입니다.");
  }
}
